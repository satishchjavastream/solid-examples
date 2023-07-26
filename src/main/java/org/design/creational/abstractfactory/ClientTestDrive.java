package org.design.creational.abstractfactory;

public class ClientTestDrive {
    public static void main(String[] args) {
        CarFactory FordCarFactory = FactoryProducer.getCarFactory("ford");
        Car Mustang = FordCarFactory.assenbleCar("Mustang");
        Mustang.drive();

        Car Focus = FordCarFactory.assenbleCar("Focus");
        Focus.drive();

        CarFactory ToyotaCarFactory = FactoryProducer.getCarFactory("toyota");
        Car Corolla = ToyotaCarFactory.assenbleCar("Corolla");
        Corolla.drive();

        Car Prius = ToyotaCarFactory.assenbleCar("Prius");
        Prius.drive();

        TruckFactory FordTruckFactory = FactoryProducer.getTruckFactory("ford");
        Truck f150 = FordTruckFactory.assembleTruck("F150");
        f150.drive();

        TruckFactory ToyotaTruckFactory = FactoryProducer.getTruckFactory("toyota");
        Truck Tacoma = ToyotaTruckFactory.assembleTruck("Tacoma");
        Tacoma.drive();

        SUVFactory KiaSUVFactory = FactoryProducer.getSUVFactory("kia");
        SUV SantaFe = KiaSUVFactory.assembleSUV("santafe");
        SantaFe.drive();

        SUVFactory HyundaiSUVFactory = FactoryProducer.getSUVFactory("hyundai");
        SUV Acadia = HyundaiSUVFactory.assembleSUV("acadia");
        Acadia.drive();
    }
}
