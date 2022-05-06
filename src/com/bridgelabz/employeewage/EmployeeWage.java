package com.bridgelabz.employeewage;

import java.util.Scanner;

class CompanyEmpWage{
     String companyName = "";
     int wagePerHour = 0;
     int fullDayHour = 0;
     int partDayHour = 0;
     int totalWorkDay = 0;
     int totalWorkHour = 0;

     public static int arrayLength = 0;

    CompanyEmpWage(){

     }

    CompanyEmpWage(String companyName,int wagePerHour,int fullDayHour,int partDayHour,int totalWorkDay,int totalWorkHour){
        this.companyName = companyName;

        this.wagePerHour =wagePerHour;

        this.fullDayHour =fullDayHour;

        this.partDayHour=partDayHour;

        this.totalWorkDay=totalWorkDay;

        this.totalWorkHour =totalWorkHour;


    }

//    public static void arrayOfObjLength(int length){
//        arrayLength = length;
//    }

}

class EmpWageBuilder extends CompanyEmpWage{

    CompanyEmpWage[] arr = new CompanyEmpWage[arrayLength];

    public void totalWage(CompanyEmpWage[] arr){

        int dayCount = 1;
        int hourCount = 0;
        int totalWage = 0;
        int dayPresent = 0;

        for(int i = 0 ; i<arr.length;i++) {
            while (dayCount <= arr[i].totalWorkDay && hourCount <= arr[i].totalWorkHour) {

                int dailyWage = 0;
                int attendance = (int) (Math.random() * 10) % 3;

                switch (attendance) {
                    case 1:
                        System.out.println("Employee is present Full Time");
                        hourCount = hourCount + arr[i].fullDayHour;
                        dailyWage = arr[i].wagePerHour * arr[i].fullDayHour;
                        dayPresent++;
                        break;
                    case 2:
                        System.out.println("Employee is present Part Time");
                        hourCount = hourCount + arr[i].partDayHour;
                        dailyWage = arr[i].wagePerHour * arr[i].partDayHour;
                        dayPresent++;
                        break;
                    default:
                        System.out.println("Employee is absent");
                }

                System.out.println("Daily Wage on Day :" + dayCount + " is :" + dailyWage);
                totalWage = totalWage + dailyWage;
                dayCount++;
            }


            System.out.println("For company " + arr[i].companyName + ". \n" +
                    "In one month of " + (dayCount - 1) + " working days, for :\n"
                    + "employees present for " + dayPresent + " days and \n"
                    + "worked for " + hourCount + " hours. \n" +
                    "earn wages: " + totalWage +"\n");
        }

    }
}


public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");

 //       CompanyEmpWage cew = new CompanyEmpWage();
        CompanyEmpWage[] arr;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of companies you would like to enter?");
        int arrayLength = sc.nextInt();

        arr = new CompanyEmpWage[arrayLength];


        for(int i = 0 ; i<arrayLength; i++) {
            Scanner sc1 = new Scanner(System.in);
            System.out.println("Enter Company Name:");
            String companyName = sc1.nextLine();

            System.out.println("Enter Wage per Hour:");
            int wagePerHour = sc1.nextInt();

            System.out.println("Enter Hours for Full Day's work:");
            int fullDayHour = sc1.nextInt();

            System.out.println("Enter Hours for Part Time's work:");
            int partDayHour = sc1.nextInt();

            System.out.println("Enter Total No. of Working Days in a Month:");
            int totalWorkDay = sc1.nextInt();

            System.out.println("Enter Total No. of Working Hours in a Month:");
            int totalWorkHour = sc1.nextInt();

            arr[i] = new CompanyEmpWage(companyName,wagePerHour,fullDayHour,partDayHour,totalWorkDay,totalWorkHour);

        }
        EmpWageBuilder ewb = new EmpWageBuilder();
        ewb.totalWage(arr);
    }
}