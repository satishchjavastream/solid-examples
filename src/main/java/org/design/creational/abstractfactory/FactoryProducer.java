package org.design.creational.abstractfactory;

public class FactoryProducer {
    public static CarFactory getCarFactory(String factoryType) {

        if("toyota".equalsIgnoreCase(factoryType)) {
            return new ToyotaCarFactory();
        }
        if("ford".equalsIgnoreCase(factoryType)) {
            return new FordCarFactory();
        }
        return null;
    }

    public static TruckFactory getTruckFactory(String factoryType) {

        if("toyota".equalsIgnoreCase(factoryType)) {
            return new ToyotaTruckFactory();
        }
        if("ford".equalsIgnoreCase(factoryType)) {
            return new FordTruckFactory();
        }
        return null;
    }

    public static SUVFactory getSUVFactory(String factoryType) {

        if("kia".equalsIgnoreCase(factoryType)) {
            return new KiaSUVFactory();
        }
        if("hyundai".equalsIgnoreCase(factoryType)) {
            return new HyundaiSUVFactory();
        }
        return null;
    }
}
