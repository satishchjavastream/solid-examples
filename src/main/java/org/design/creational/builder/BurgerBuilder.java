package org.design.creational.builder;

public class BurgerBuilder {

    private Burger burger;
    private String bread;
    private String patty;
    private String veggies;
    private String sauces;

    public BurgerBuilder(){
        this.burger = new Burger();
    }

    public BurgerBuilder setBread(String bread) {
        this.bread = bread;
        return this;
    }

    public BurgerBuilder setPatty(String patty) {
        this.patty = patty;
        return this;
    }

    public BurgerBuilder setVeggies(String veggies) {
        this.veggies = veggies;
        return this;
    }

    public BurgerBuilder setSauces(String sauces) {
        this.sauces = sauces;
        return this;
    }

    public Burger build(){
        return new Burger(bread,patty,veggies,sauces);
    }
}
