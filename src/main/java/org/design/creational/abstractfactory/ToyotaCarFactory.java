package org.design.creational.abstractfactory;

public class ToyotaCarFactory implements CarFactory{
    @Override
    public Car assenbleCar(String carType) {
        if("Corolla".equalsIgnoreCase(carType)) {
            return new Corolla();
        }
        if("Prius".equalsIgnoreCase(carType)) {
            return new Prius();
        }
        return null;
    }
}
