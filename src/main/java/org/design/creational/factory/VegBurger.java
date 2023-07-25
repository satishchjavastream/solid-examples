package org.design.creational.factory;

public class VegBurger implements Burger{
    public VegBurger() {
    }

    @Override
    public void setFoodIngredients() {
        System.out.println("Vegetables, onion,capsicum,green chilli,Tomato");
    }

    @Override
    public void make() {
        System.out.println("Bread + Vegetables + cheese = Veg Burger ");
    }

}
