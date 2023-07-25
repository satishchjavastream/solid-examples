package org.design.creational.factory;

public class MobileCommunication implements Communication{
    @Override
    public void process(Employee employee) {
        System.out.println(employee.getName()+" communication via Mobile :"+employee.getPhoneNumber());
    }
}
