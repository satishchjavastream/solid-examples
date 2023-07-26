package org.design.creational.abstractfactory;

public class Prius implements Car{
    String color1 = "red";
    String color2 = "black";
    String color3 = "silver";

    @Override
    public void drive() {
        System.out.println("Driving a " + color3 + " Prius around the block.");
    }
}
