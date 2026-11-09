
import java.util.Scanner;

public class Employee {

    // Employee class
    static class Emp {

        private int employeeId;
        private String name;
        private String department;
        private double salary;

        // Constructor
        Emp(int employeeId, String name,
            String department, double salary) {

            this.employeeId = employeeId;
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        // Display employee details
        void displayDetails() {

            System.out.println("\n========== EMPLOYEE DETAILS ==========");
            System.out.println("Employee ID : " + employeeId);
            System.out.println("Name        : " + name);
            System.out.println("Department  : " + department);
            System.out.printf("Salary      : %.2f%n", salary);
            System.out.println("=======================================");
        }
    }

    // Main method
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("===== EMPLOYEE DETAILS MANAGER =====");

        System.out.print("Enter Employee ID: ");
        int id = Integer.parseInt(sc.nextLine());

        System.out.print("Enter Employee Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = Double.parseDouble(sc.nextLine());

        // Create Employee object
        Emp employee = new Emp(id, name, department, salary);

        // Display employee information
        employee.displayDetails();

        sc.close();
    }
}

