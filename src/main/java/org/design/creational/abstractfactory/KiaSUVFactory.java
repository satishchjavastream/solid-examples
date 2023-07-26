package org.design.creational.abstractfactory;

public class KiaSUVFactory implements SUVFactory{
    @Override
    public SUV assembleSUV(String SUVType) {

        if("santafe".equalsIgnoreCase(SUVType)) {
            return new SantaFe();
        }
        return null;
    }
}
