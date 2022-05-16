package com.bridgelabz.employeewage;

import java.util.ArrayList;
import java.util.List;

public interface WageCalculate {

    int dayCount = 1;
    int hourCount = 0;
    int totalWage = 0;
    int dayPresent = 0;


    void calculateTotalWage();
}
