package org.testify;

public class Student {
    // Variables
    private String name;
    private  String email;
    private String gradeLevel;
    private String major;
    private int age;
    private int id;
    // Getters and Setters
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getGradeLevel() {
        return gradeLevel;
    }
    public String getMajor() {
        return major;
    }
    public int getAge() {
        return age;
    }
    public int getId() {
        return id;
    }
    private void setName(String name) {
        this.name = name;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    private void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
    private void setMajor(String major) {
        this.major = major;
    }
    private void setAge(int age) {
        this.age = age;
    }
    private void setId(int id) {
        this.id = id;
    }
    // Constructor
    public Student(String name, String email, String gradeLevel, String major, int age, int id) {
        setName(name);
        setEmail(email);
        setGradeLevel(gradeLevel);
        setMajor(major);
        setAge(age);
        setId(id);
    }
}
