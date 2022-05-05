package com.bridgelabz.employeewage;

public class EmployeeWage {

    static final int WAGE_PER_HOUR = 20;
    static final int FULL_DAY_HOUR = 8;

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int dailyWage =0;

        int attendance = (int)(Math.random()*10)%2;
        if (attendance == 0){
            System.out.println("Employee is absent");
        }
        else {
            System.out.println("Employee is present");
            dailyWage = WAGE_PER_HOUR*FULL_DAY_HOUR;
        }

        System.out.println("Daily Wage :"+dailyWage);
    }
}