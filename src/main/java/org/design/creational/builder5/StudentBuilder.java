package org.design.creational.builder5;

public class StudentBuilder {

    private Student student;
    private String firstName; // mandatory
    private String lastName; // mandatory
    private String age; // optional
    private String gender; // optional
    private boolean isGraduate; // optional
    private boolean hasExperience; // optional
    private String city; // optional
    private String state; // optional
    private boolean isEarning; // optional

    public StudentBuilder(){
        this.student = new Student();
    }

    public StudentBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public StudentBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public StudentBuilder setAge(String age) {
        this.age = age;
        return this;
    }

    public StudentBuilder setGender(String gender) {
        this.gender = gender;
        return this;
    }

    public StudentBuilder setGraduate(boolean graduate) {
        isGraduate = graduate;
        return this;
    }

    public StudentBuilder setHasExperience(boolean hasExperience) {
        this.hasExperience = hasExperience;
        return this;
    }

    public StudentBuilder setCity(String city) {
        this.city = city;
        return this;
    }

    public StudentBuilder setState(String state) {
        this.state = state;
        return this;
    }

    public StudentBuilder setEarning(boolean earning) {
        isEarning = earning;
        return this;
    }

    public Student build(){
        return new Student(firstName,lastName,age,gender,isGraduate,hasExperience,city,state,isEarning);
    }

}
