package com.company.Utils;

import com.company.Model.Employee;

public class Utils {

    public static double averageSalary(Employee[] arr, int index){
        double sum = 0;
        for (int i = 0; i <= index; i++) {
            sum += arr[i].get_salary();
        }
        return sum / (index + 1);
    }

    public static double getHighestPaidEmployee(Employee[] arr, int index){
        double highest = arr[0].get_salary();
        for (int i = 1; i <= index; i++) {
            if (arr[i].get_salary() > highest) {
                highest = arr[i].get_salary();
            }
        }
        return highest;
    }
}
