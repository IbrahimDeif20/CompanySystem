package com.company.Model;

import java.util.Scanner;

public class Employee {


    private int id;
    private String name;
    private double salary;

    public Employee() {
    }

    public int get_id() {
        return id;
    }

    public String get_name() {
        return name;
    }

    public double get_salary() {
        return salary;
    }

    public void set_id(int id) {
        this.id = id;
    }

    public void set_name(String name) {
        this.name = name;
    }

    public void set_salary(double salary) {
        this.salary = salary;
    }

    Scanner scanner = new Scanner(System.in);

    public void enterEmployee() {
        System.out.println("Enter ID:");
        set_id(scanner.nextInt());
        System.out.println("Enter Name:");
        set_name(scanner.next());
        System.out.println("Enter Salary:");
        set_salary(scanner.nextDouble());
    }




}
