package com.company.Service;

import com.company.Model.Employee;
import com.company.Utils.Utils;


public class Service {
    Employee[] system;
    int top =-1;

    public void createSystem(int number) {
        system = new Employee[number];
        top = number-1; //index of actual numbers in system

        for (int i = 0; i < number; i++) {
            System.out.println("For Employee " + (i + 1) + ":");
            Employee employee = new Employee();
            employee.enterEmployee();
            system[i] = employee;
        }
    }
    public void displayEmployee(int index) {
        System.out.println("ID: " + system[index].get_id());
        System.out.println("Name: " + system[index].get_name());
        System.out.println("Salary: " + system[index].get_salary());
    }

    public void displayEmployees() {
        for (int i = 0; i <= top; i++) {
            System.out.println("ID: " + system[i].get_id());
            System.out.println("Name: " + system[i].get_name());
            System.out.println("Salary: " + system[i].get_salary());
        }
    }

    private Employee createEmployee(){
        Employee employee = new Employee();
        employee.enterEmployee();
        return employee;
    }

    public void addEmployee() {

        if(top == system.length-1){
            Employee[] temp = new Employee[system.length*2];
            for (int i = 0; i < system.length; i++) {
                temp[i] = system[i];
            }
            system = temp;
        }
        Employee emp= createEmployee();

        if(search(emp.get_id()) == -1){
            system[++top] = emp;
        }
        else{
            System.out.println("Employee already exists");
        }
    }

    public int search(int id) {
        for (int i = 0; i <= top; i++) {
            if (system[i].get_id() == id) {
                return i;
            }
        }
        return -1;
    }

    public void deleteEmployee(int id) {
       int index = search(id);
            if (index != -1) {
                for (int j = index; j < top; j++) {
                    system[j] = system[j + 1];
                }
                --top;
            }
            else {
                System.out.println("Employee not found");
            }
    }

    public void helper(){
        System.out.println("The average value is " + (Utils.averageSalary(system, top)));
        System.out.println("The highest salary is " + Utils.getHighestPaidEmployee(system, top));
    }


}