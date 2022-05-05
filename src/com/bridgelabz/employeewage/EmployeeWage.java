package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;
    static final int TOTAL_WORK_DAY = 20;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dayCount = 1;

        while (dayCount<TOTAL_WORK_DAY) {

            int dailyWage = 0;
            int attendance = (int) (Math.random() * 10) % 3;

            switch (attendance) {
                case 1:
                    System.out.println("Employee is present Full Time");
                    dailyWage = WAGE_PER_HOUR * FULL_DAY_HOUR;
                    break;
                case 2:
                    System.out.println("Employee is present Part Time");
                    dailyWage = WAGE_PER_HOUR * PART_DAY_HOUR;
                    break;
                default:
                    System.out.println("Employee is absent");
            }

            System.out.println("Daily Wage on Day :" + dayCount + " is :" +dailyWage);
            dayCount++;
        }
    }
}