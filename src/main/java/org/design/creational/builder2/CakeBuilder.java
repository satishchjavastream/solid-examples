package org.design.creational.builder2;

public class CakeBuilder {
   private Cake cake;

    private  double sugar;   //cup
    private  double butter;  //cup
    private  int eggs;
    private  int vanila;     //spoon
    private  double flour;   //cup
    private  double bakingpowder; //spoon
    private  double milk;  //cup
    private  int cherry;


    public CakeBuilder(){
        this.cake = new Cake();
    }
    public CakeBuilder setSugar(double sugar) {
        this.sugar = sugar;
        return this;
    }

    public CakeBuilder setButter(double butter) {
        this.butter = butter;
        return this;
    }

    public CakeBuilder setEggs(int eggs) {
        this.eggs = eggs;
        return this;
    }

    public CakeBuilder setVanila(int vanila) {
        this.vanila = vanila;
        return this;
    }

    public CakeBuilder setFlour(double flour) {
        this.flour = flour;
        return this;
    }

    public CakeBuilder setBakingpowder(double bakingpowder) {
        this.bakingpowder = bakingpowder;
        return this;
    }

    public CakeBuilder setMilk(double milk) {
        this.milk = milk;
        return this;
    }

    public CakeBuilder setCherry(int cherry) {
        this.cherry = cherry;
        return this;
    }

    public Cake build(){
        return new Cake(sugar,butter,eggs,vanila,flour,bakingpowder,milk,cherry);
    }
}
