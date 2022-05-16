package com.bridgelabz.employeewage;

public interface WageCalculate {

    int dayCount = 1;
    int hourCount = 0;
    int totalWage = 0;
    int dayPresent = 0;

    void totalWage(CompanyEmpWage[] arr);
}
