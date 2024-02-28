package org.testify;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, welcome to the student database!");
        System.out.println("This is a simple program that allows you to add and remove students from a list.");
        System.out.println("You can also view the list of students.");
        int choice = 0;
        Scanner scanner = new Scanner(System.in);
        StudentList studentList = new StudentList();
        while (choice != 4) {
            printMenu();
            // Get the user's choice
            // Use a Scanner object to get the user's choice
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Add a student
                    studentList.addStudent();
                    break;
                case 2:
                    // Remove a student
                    studentList.removeStudent();
                    break;
                case 3:
                    // View the list of students
                    studentList.print();
                    break;
                case 4:
                    // Exit the program
                    System.out.println("Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }
    private static void printMenu() {
        System.out.println("1. Add a student");
        System.out.println("2. Remove a student");
        System.out.println("3. View the list of students");
        System.out.println("4. Exit");
        System.out.println("Enter your choice: ");
    }
}