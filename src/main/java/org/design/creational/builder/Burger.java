package org.design.creational.builder;

public class Burger {
    private String bread;
    private String patty;
    private String veggies;
    private String sauces;

    public Burger(String bread, String patty, String veggies, String sauces) {
        this.bread = bread;
        this.patty = patty;
        this.veggies = veggies;
        this.sauces = sauces;
    }

    public Burger() {

    }

    @Override
    public String toString() {
        return "Burger{" +
                "bread='" + bread + '\'' +
                ", patty='" + patty + '\'' +
                ", veggies='" + veggies + '\'' +
                ", sauces='" + sauces + '\'' +
                '}';
    }
}
