package com.bridgelabz.employeewage;

import java.util.Scanner;

class CalculateEmployeeWage{

    private boolean enterDetailsAgain = true;

    public void getCompanyDetails(){

        while(enterDetailsAgain) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter Company Name:");
            String companyName = sc.nextLine();

            System.out.println("Enter Wage per Hour:");
            int wagePerHour = sc.nextInt();

            System.out.println("Enter Wage for Full Day's work:");
            int fullDayHour = sc.nextInt();

            System.out.println("Enter Wage for Part Time's work:");
            int partDayHour = sc.nextInt();

            System.out.println("Enter Total No. of Working Days in a Month:");
            int totalWorkDay = sc.nextInt();

            System.out.println("Enter Total No. of Working Hours in a Month:");
            int totalWorkHour = sc.nextInt();

            totalWage(companyName,wagePerHour,fullDayHour,partDayHour,totalWorkDay,totalWorkHour);

            System.out.println("Would you like to enter again ?(Enter Y to continue or any key to exit the program)");
            char c = sc.next().charAt(0);

            if(c == 'Y'|| c == 'y'){
                continue;
            }
            else {
                System.out.println("Thank you for using the Employee Wage Computation Program");
                break;
            }

        }
    }

    public void totalWage(String companyName,int wagePerHour,int fullDayHour,int partDayHour,int totalWorkDay,int totalWorkHour){

        int dayCount = 1;
        int hourCount = 0;
        int totalWage = 0;
        int dayPresent = 0;


        while (dayCount<=totalWorkDay && hourCount<=totalWorkHour) {

            int dailyWage = 0;
            int attendance = (int) (Math.random() * 10) % 3;

            switch (attendance) {
                case 1:
                    System.out.println("Employee is present Full Time");
                    hourCount = hourCount + fullDayHour;
                    dailyWage = wagePerHour * fullDayHour;
                    dayPresent++;
                    break;
                case 2:
                    System.out.println("Employee is present Part Time");
                    hourCount = hourCount + partDayHour;
                    dailyWage = wagePerHour * partDayHour;
                    dayPresent++;
                    break;
                default:
                    System.out.println("Employee is absent");
            }

            System.out.println("Daily Wage on Day :" + dayCount + " is :" +dailyWage);
            totalWage = totalWage + dailyWage;
            dayCount++;
        }
        System.out.println("For company "+ companyName +". \n" +
                "In one month of "+(dayCount-1)+" working days, for :\n"
                +"employees present for "+dayPresent+ " days and \n"
                +"worked for "+ hourCount + " hours. \n"+
                "earn wages: "+ totalWage);

    }
}


public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

        CalculateEmployeeWage cew = new CalculateEmployeeWage();
        cew.getCompanyDetails();

    }
}