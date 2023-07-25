package org.design.creational.factory;

public class BeafBurger implements Burger{
    @Override
    public void setFoodIngredients() {
        System.out.println("Beef, onion,capsicum,green chilli,Tomato");
    }

    @Override
    public void make() {
        System.out.println("Bread + Beef + cheese = Beef Burger");
    }
}
