package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;
    static final int PART_DAY_HOUR = 4;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dailyWage =0;

        int attendance = (int)(Math.random()*10)%3;
        if (attendance == 0){
            System.out.println("Employee is absent");
        } else if (attendance == 1) {
            System.out.println("Employee is present Full Time");
            dailyWage = WAGE_PER_HOUR*FULL_DAY_HOUR;
        } else {
            System.out.println("Employee is present Part Time");
            dailyWage = WAGE_PER_HOUR*PART_DAY_HOUR;
        }

        System.out.println("Daily Wage :"+dailyWage);
    }
}