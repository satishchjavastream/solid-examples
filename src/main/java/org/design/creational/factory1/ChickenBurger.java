package org.design.creational.factory1;

public class ChickenBurger implements Burger{
    @Override
    public void setFoodIngredients() {
        System.out.println("Chicken, onion,capsicum,green chilli,Tomato");
    }

    @Override
    public void make() {
        System.out.println("Bread + Chicken + cheese = Chicken Burger");
    }

}
