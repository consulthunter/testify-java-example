package org.testify;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentList {
    // Variables
    private ArrayList<Student> students;
    // Getters and Setters
    public ArrayList<Student> getStudents() {
        return students;
    }
    private void setStudents(ArrayList<Student> students) {
        this.students = students;
    }
    // Methods
    private Student getStudentInfo(){
        Scanner scanner = new Scanner(System.in);
        // Add a student
        System.out.println("Enter the student's name: ");
        // Use a Scanner object to get the student's name
        String name = scanner.nextLine();
        System.out.println("Enter the student's email: ");
        // Use a Scanner object to get the student's email
        String email = scanner.nextLine();
        System.out.println("Enter the student's grade level: ");
        // Use a Scanner object to get the student's grade level
        String gradeLevel = scanner.nextLine();
        System.out.println("Enter the student's major: ");
        // Use a Scanner object to get the student's major
        String major = scanner.nextLine();
        System.out.println("Enter the student's age: ");
        // Use a Scanner object to get the student's age
        int age = scanner.nextInt();
        System.out.println("Enter the student's ID: ");
        // Use a Scanner object to get the student's ID
        int id = scanner.nextInt();
        // Create a new Student object
        return new Student(name, email, gradeLevel, major, age, id);
    }
    public void addStudent() {
        // Get the student's information
        Student student = getStudentInfo();
        // Check if the student is already in the list
        if (students.contains(student)) {
            System.out.println("The student is already in the list.");
        }
        // Add the student to the list
        else {
            System.out.println("The student has been added to the list.");
            students.add(student);
        }
    }
    public void removeStudent() {
        // Get the student's information
        Student student = getStudentInfo();
        // Check if the student is in the list
        if (!students.contains(student)) {
            System.out.println("The student is not in the list.");
        }
        // Remove the student from the list
        else {
            System.out.println("The student has been removed from the list.");
            students.remove(student);
        }
    }
    public void print(){
        for (Student student : getStudents()) {
            System.out.println("Name: " + student.getName() + ", Email: " + student.getEmail() + ", Grade Level: " + student.getGradeLevel() + ", Major: " + student.getMajor() + ", Age: " + student.getAge() + ", ID: " + student.getId());
        }
    }
    // Constructor
    public StudentList() {
        setStudents(new ArrayList<>());
    }
}
