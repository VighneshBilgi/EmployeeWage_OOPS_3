package com.bridgelabz.employeewage;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        int attendance = (int)(Math.random()*10)%2;
        if (attendance == 0){
            System.out.println("Employee is absent");
        }
        else {
            System.out.println("Employee is present");
        }

    }
}