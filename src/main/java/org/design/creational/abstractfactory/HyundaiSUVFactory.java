package org.design.creational.abstractfactory;

public class HyundaiSUVFactory implements SUVFactory{
    @Override
    public SUV assembleSUV(String SUVtype) {

        if("acadia".equalsIgnoreCase(SUVtype)) {
            return new Acadia();
        }
        return null;
    }
}
