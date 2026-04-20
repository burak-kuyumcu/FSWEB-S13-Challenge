package org.example;

import org.example.enums.Plan;

public class Main {
    public static void main(String[] args) {
        runApplication();
    }

    public static void runApplication() {
        Healthplan healthplan = new Healthplan(1, "Employee Basic Plan", Plan.BASIC);
        Employee employee = new Employee(
                101,
                "Burak Kuyumcu",
                "burak@example.com",
                "12345",
                new String[3]
        );
        Company company = new Company(
                201,
                "Workintech",
                150000.75,
                new String[3]
        );

        employee.addHealthPlan(0, "Basic");
        employee.addHealthPlan(0, "Premium");
        employee.addHealthPlan(5, "Gold");

        company.addEmployee(0, "Ali");
        company.addEmployee(1, "Ayse");
        company.addEmployee(1, "Mehmet");
        company.addEmployee(5, "Zeynep");

        System.out.println(healthplan.toString());
        System.out.println(employee.toString());
        System.out.println(company.toString());
    }
}