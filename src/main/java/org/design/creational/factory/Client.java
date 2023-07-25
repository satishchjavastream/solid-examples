package org.design.creational.factory;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        List<Employee> employeeList = createEmployeeList();
        CommunicationFactory factory = new CommunicationFactory();
        Communication communication;
        employeeList.forEach(emp->{factory.getProcess(emp.getModeOfContact()).process(emp);});
    }

    private static List<Employee> createEmployeeList(){

        List<Employee> employeeList = new ArrayList<>();
        Employee employee1 = new Employee("Satish", "1","Firsco",30,"email","satish@gmail.com","9008007009");
        Employee employee2 = new Employee("Ramesh", "2","Findly",20,"mobile","ramesh@gmail.com","9008007008");
        Employee employee3 = new Employee("Rajesh", "3","Edgewood",40,"email","rajesh@gmail.com","9008007007");
        Employee employee4 = new Employee("Sam", "4","Dallas",30,"mobile","sam@gmail.com","9008007006");
        Employee employee5 = new Employee("Suresh", "5","Findly",30,"mobile","suresh@gmail.com","9008007005");
        Employee employee6 = new Employee("Ram", "6","Firsco",40,"email","ram@gmail.com","9008007004");

        employeeList.add(employee1);
        employeeList.add(employee2);
        employeeList.add(employee3);
        employeeList.add(employee4);
        employeeList.add(employee5);
        employeeList.add(employee6);

        return employeeList;


    }
}
