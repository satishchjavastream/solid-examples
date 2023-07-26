package org.design.creational.builder2;

public class Cake {
    private  double sugar;   //cup
    private  double butter;  //cup
    private  int eggs;
    private  int vanila;     //spoon
    private  double flour;   //cup
    private  double bakingpowder; //spoon
    private  double milk;  //cup
    private  int cherry;

    public Cake(double sugar, double butter, int eggs, int vanila, double flour, double bakingpowder, double milk, int cherry) {
        this.sugar = sugar;
        this.butter = butter;
        this.eggs = eggs;
        this.vanila = vanila;
        this.flour = flour;
        this.bakingpowder = bakingpowder;
        this.milk = milk;
        this.cherry = cherry;
    }

    public Cake() {

    }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butter=" + butter +
                ", eggs=" + eggs +
                ", vanila=" + vanila +
                ", flour=" + flour +
                ", bakingpowder=" + bakingpowder +
                ", milk=" + milk +
                ", cherry=" + cherry +
                '}';
    }
}
