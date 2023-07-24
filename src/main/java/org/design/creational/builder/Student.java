package org.design.creational.builder;

public class Student {
    private String firstName; // mandatory
    private String lastName; // mandatory
    private String age; // optional
    private String gender; // optional
    private boolean isGraduate; // optional
    private boolean hasExperience; // optional
    private String city; // optional
    private String state; // optional
    private boolean isEarning; // optional

    public Student() {
    }

    public Student(String firstName, String lastName, String age, String gender, boolean isGraduate, boolean hasExperience, String city, String state, boolean isEarning) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.gender = gender;
        this.isGraduate = isGraduate;
        this.hasExperience = hasExperience;
        this.city = city;
        this.state = state;
        this.isEarning = isEarning;
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age='" + age + '\'' +
                ", gender='" + gender + '\'' +
                ", isGraduate=" + isGraduate +
                ", hasExperience=" + hasExperience +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", isEarning=" + isEarning +
                '}';
    }
}
