package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int TOTAL_WORK_DAY = 20;
    static final int TOTAL_WORK_HOUR = 100;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dayCount = 1;
        int hourCount = 0;
        int totalWage = 0;
        int dayPresent = 0;
        while (dayCount<=TOTAL_WORK_DAY && hourCount<=TOTAL_WORK_HOUR) {

            int dailyWage = 0;
            int attendance = (int) (Math.random() * 10) % 3;

            switch (attendance) {
                case 1:
                    System.out.println("Employee is present Full Time");
                    hourCount = hourCount + FULL_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    dayPresent++;
                    break;
                case 2:
                    System.out.println("Employee is present Part Time");
                    hourCount = hourCount + PART_DAY_HOUR;
                    dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                    dayPresent++;
                    break;
                default:
                    System.out.println("Employee is absent");
            }

            System.out.println("Daily Wage on Day :" + dayCount + " is :" +dailyWage);
            totalWage = totalWage + dailyWage;
            dayCount++;
        }
        System.out.println("In one month of "+(dayCount-1)+" working days, employee worked for :\n"
                +dayPresent+ " days and \n"
                + hourCount + " hours and \n"+
                "earned total wages of "+ totalWage);
    }
}