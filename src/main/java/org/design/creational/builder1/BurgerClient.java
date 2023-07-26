package org.design.creational.builder1;

public class BurgerClient {
    public static void main(String[] args) {
        Burger burger1 = new BurgerBuilder().setBread("brown bread").setSauces("yellow").setPatty("chicken").setVeggies("onion").build();

        Burger burger2 = new BurgerBuilder().setBread("White Bread").setSauces("white").setVeggies("onion").setVeggies("capsicum").build();


        System.out.println(burger1);
        System.out.println(burger2);
    }
}
