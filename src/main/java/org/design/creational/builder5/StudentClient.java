package org.design.creational.builder5;

public class StudentClient {
    public static void main(String[] args) {
        Student student = new StudentBuilder().setFirstName("Satish").setLastName("Ch").setGender("Male").build();

        Student student1 = new StudentBuilder().setFirstName("Ramesh").setLastName("Kumar").setCity("USA").setState("TX").build();

        System.out.println(student);
        System.out.println(student1);
    }
}
