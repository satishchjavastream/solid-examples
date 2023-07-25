package org.design.creational.factory;

public class EmialCommunication implements Communication{
    @Override
    public void process(Employee employee) {
        System.out.println(employee.getName()+" communication via Email :"+employee.getEmail());
    }
}
