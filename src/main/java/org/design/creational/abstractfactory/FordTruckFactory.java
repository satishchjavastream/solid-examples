package org.design.creational.abstractfactory;

public class FordTruckFactory implements TruckFactory{
    @Override
    public Truck assembleTruck(String truckType) {

        if("f150".equalsIgnoreCase(truckType)) {
            return new F150();
        }
        return null;
    }
}
