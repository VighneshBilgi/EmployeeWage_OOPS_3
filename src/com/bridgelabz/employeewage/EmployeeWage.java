package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


class CompanyEmpWage {

    static Scanner sc1 = new Scanner(System.in);
    String companyName;
    int wagePerHour;
    int fullDayHour;
    int partDayHour;
    int totalWorkDay;
    int totalWorkHour ;


    CompanyEmpWage(){

    }

    public void setCompanyName(String companyName){
        this.companyName = companyName;
    }

    public void setWagePerHour(int wagePerHour){
        this.wagePerHour = wagePerHour;
    }

    public void setFullDayHour(int fullDayHour){
        this.fullDayHour = fullDayHour;
    }

    public void setPartDayHour(int partDayHour){
        this.partDayHour = partDayHour;
    }

    public void setTotalWorkDay(int totalWorkDay){
        this.totalWorkDay= totalWorkDay;
    }

    public void setTotalWorkHour(int totalWorkHour){
        this.totalWorkHour =totalWorkHour;
    }

    public String getCompanyName(){
        return companyName;
    }

    public int getWagePerHour(){
        return wagePerHour;
    }

    public int getFullDayHour(){
        return fullDayHour;
    }

    public int getPartDayHour(){
        return partDayHour;
    }

    public int getTotalWorkDay(){
        return totalWorkDay;
    }

    public int getTotalWorkHour(){
        return totalWorkHour;
    }



}

class EmpWageBuilder extends CompanyEmpWage implements WageCalculate{

    List<CompanyEmpWage> companyEmpWageList = new ArrayList<>();




    public void addDetails(){
        CompanyEmpWage cew = new CompanyEmpWage();

        System.out.println("Enter Company Name:");
        companyName = sc1.next();
        cew.setCompanyName(companyName);
        System.out.println("Enter Wage per Hour:");
        wagePerHour = sc1.nextInt();
        cew.setWagePerHour(wagePerHour);
        System.out.println("Enter Hours for Full Day's work:");
        fullDayHour = sc1.nextInt();
        cew.setFullDayHour(fullDayHour);
        System.out.println("Enter Hours for Part Time's work:");
        partDayHour = sc1.nextInt();
        cew.setPartDayHour(partDayHour);
        System.out.println("Enter Total No. of Working Days in a Month:");
        totalWorkDay = sc1.nextInt();
        cew.setTotalWorkDay(totalWorkDay);
        System.out.println("Enter Total No. of Working Hours in a Month:");
        totalWorkHour = sc1.nextInt();
        cew.setTotalWorkHour(totalWorkHour);
        companyEmpWageList.add(cew);

    }

    public void getDetails(){

        System.out.println("You entered the Wage information for the following companies: ");
        for(CompanyEmpWage company:companyEmpWageList){

            companyName = company.getCompanyName();
            System.out.println("Company Name: "+companyName);
            wagePerHour = company.getWagePerHour();
            System.out.println("Wage per Hour: "+wagePerHour);
            fullDayHour = company.getFullDayHour();
            System.out.println("Hours for Full Day's work: "+fullDayHour);
            partDayHour = company.getPartDayHour();
            System.out.println("Hours for Part Time's work: "+partDayHour);
            totalWorkDay = company.getTotalWorkDay();
            System.out.println("Total No. of Working Days in a Month: "+totalWorkDay);
            totalWorkHour = company.getTotalWorkHour();
            System.out.println("Total No. of Working Hours in a Month: "+totalWorkHour);
        }
        System.out.println("*******************************************");
    }
    @Override
    public void totalWage(){



        for(CompanyEmpWage company:companyEmpWageList) {

            int dayCount = WageCalculate.dayCount;
            int hourCount = WageCalculate.hourCount;
            int totalWage = WageCalculate.totalWage;
            int dayPresent = WageCalculate.dayPresent;

            System.out.println("Calculating Employee Wage for Company :"+company.companyName);
            while (dayCount <= company.totalWorkDay && hourCount <= company.totalWorkHour) {

                int dailyWage = 0;
                int attendance = (int) (Math.random() * 10) % 3;

                switch (attendance) {
                    case 1:
                        System.out.println("Employee is present Full Time");
                        hourCount = hourCount + company.fullDayHour;
                        dailyWage = company.wagePerHour * company.fullDayHour;
                        dayPresent++;
                        break;
                    case 2:
                        System.out.println("Employee is present Part Time");
                        hourCount = hourCount + company.partDayHour;
                        dailyWage = company.wagePerHour * company.partDayHour;
                        dayPresent++;
                        break;
                    default:
                        System.out.println("Employee is absent");
                }

                System.out.println("Daily Wage on Day :" + dayCount + " is :" + dailyWage);
                totalWage = totalWage + dailyWage;
                dayCount++;
            }


            System.out.println("For company " + company.companyName + ". \n" +
                    "In one month of " + (dayCount - 1) + " working days:\n"
                    + "employees present for " + dayPresent + " days and \n"
                    + "worked for " + hourCount + " hours \n" +
                    "earn total wages of : " + totalWage +"\n");
        }
        System.out.println("*******************************************");
    }
}


public class EmployeeWage {

    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation Program");
        Scanner sc = new Scanner(System.in);
        boolean addAgain = true;


        EmpWageBuilder ewb = new EmpWageBuilder();

        while (addAgain) {
            ewb.addDetails();

            System.out.println("Do you wish to add another Company Wage details? (If Yes , Enter Y else any key to exit)");
            char c = sc.next().charAt(0);

            if (c == 'y' || c == 'Y')
                continue;
            else
                break;
        }

        ewb.getDetails();
        ewb.totalWage();

        System.out.println("Exiting Program...");


    }
}