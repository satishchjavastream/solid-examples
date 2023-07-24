package org.design.creational.builder;

public class Juice {

    private int water;
    private int fruit;
    private int sugar;
    private int icecube;
    private String juicename;

    public Juice() {
    }

    public Juice(int water, int fruit, int sugar, int icecube, String juicename) {
        this.water = water;
        this.fruit = fruit;
        this.sugar = sugar;
        this.icecube = icecube;
        this.juicename = juicename;
    }

    @Override
    public String toString() {
        return "Juice{" +
                "water=" + water +
                ", fruit=" + fruit +
                ", sugar=" + sugar +
                ", icecube=" + icecube +
                ", juicename='" + juicename + '\'' +
                '}';
    }
}
