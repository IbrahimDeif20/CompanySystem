package com.company.Main;

import com.company.Model.Employee;
import com.company.Service.Service;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee();
        Service service = new Service();
        service.createSystem(3);
        service.displayEmployees();
        System.out.println("The employee you search for is");
        service.displayEmployee(service.search(1));
        service.addEmployee();
        service.deleteEmployee(2);
        service.displayEmployees();
        service.helper();

    }

}
