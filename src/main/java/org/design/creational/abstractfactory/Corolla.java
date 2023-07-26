package org.design.creational.abstractfactory;

public class Corolla implements Car{
    String color1 = "red";
    String color2 = "black";
    String color3 = "silver";


    @Override
    public void drive() {
        System.out.println("Driving a " + color2 + " Corolla down the street." );
    }
}
