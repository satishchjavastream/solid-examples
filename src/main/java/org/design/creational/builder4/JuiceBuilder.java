package org.design.creational.builder4;

public class JuiceBuilder {

    private Juice juice;

    private int water;
    private int fruit;
    private int sugar;
    private int icecube;
    private String juicename;

    public JuiceBuilder() {
        this.juice = new Juice();
    }

    public JuiceBuilder setJuice(Juice juice) {
        this.juice = juice;
        return this;
    }

    public JuiceBuilder setWater(int water) {
        this.water = water;
        return this;
    }

    public JuiceBuilder setFruit(int fruit) {
        this.fruit = fruit;
        return this;
    }

    public JuiceBuilder setSugar(int sugar) {
        this.sugar = sugar;
        return this;
    }

    public JuiceBuilder setIcecube(int icecube) {
        this.icecube = icecube;
        return this;
    }

    public JuiceBuilder setJuicename(String juicename) {
        this.juicename = juicename;
        return this;
    }

    public Juice build(){
        return new Juice(water,fruit,sugar,icecube,juicename);
    }
}
