package org.design.creational.abstractfactory;

public class SantaFe implements SUV{
    int year1 = 2018;
    int year2 = 2017;
    int year3 = 2016;

    @Override
    public void drive() {
        System.out.println("Driving a " + year2 + " SantaFe with my firend.");
    }
}
