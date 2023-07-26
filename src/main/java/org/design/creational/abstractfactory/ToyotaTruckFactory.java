package org.design.creational.abstractfactory;

public class ToyotaTruckFactory implements TruckFactory{
    @Override
    public Truck assembleTruck(String trucktype) {

        if("tacoma".equalsIgnoreCase(trucktype)) {
            return new Tacoma();
        }
        return null;
    }

}
