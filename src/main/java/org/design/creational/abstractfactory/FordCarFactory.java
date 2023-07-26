package org.design.creational.abstractfactory;

public class FordCarFactory implements CarFactory{
    @Override
    public Car assenbleCar(String carType) {
        if ("Focus".equalsIgnoreCase(carType)) {
            return new Focus();
        }
        if ("Mustang".equalsIgnoreCase(carType)) {
            return new Mustang();
        }
        return null;
    }
}
