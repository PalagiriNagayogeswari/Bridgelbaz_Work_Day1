package com.bridgelabz_oops;
import java.util.Scanner;
class Employee {
    int id;
    String name;
    double salary;

    void addEmployee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
}


public class EmployeeManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Employee[] employees = new Employee[100];
        int count = 0;

        while (true) {

            System.out.println("\n===== Employee Management System =====");
            System.out.println("1. Add Employee");
            System.out.println("2. Search Employee");
            System.out.println("3. Display Employees");
            System.out.println("4. Exit");

            System.out.print("Enter Choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:

                    employees[count] = new Employee();

                    System.out.print("Enter Employee ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Employee Name: ");
                    String name = sc.nextLine();

                    System.out.print("Enter Salary: ");
                    double salary = sc.nextDouble();

                    employees[count].addEmployee(id, name, salary);
                    count++;

                    System.out.println("Employee Added Successfully!");
                    break;

                case 2:

                    System.out.print("Enter Employee ID to Search: ");
                    int searchId = sc.nextInt();

                    boolean found = false;

                    for (int i = 0; i < count; i++) {

                        if (employees[i].id == searchId) {

                            System.out.println("\nEmployee Found:");
                            employees[i].displayEmployee();

                            found = true;
                            break;
                        }
                    }

                    if (!found) {
                        System.out.println("Employee Not Found!");
                    }

                    break;

                case 3:

                    if (count == 0) {
                        System.out.println("No Employees Available.");
                    } else {

                        System.out.println("\nEmployee Details:");

                        for (int i = 0; i < count; i++) {
                            employees[i].displayEmployee();
                        }
                    }

                    break;

                case 4:

                    System.out.println("Exiting...");
                    sc.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}