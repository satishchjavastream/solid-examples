package org.design.creational.builder2;

public class CakeClient {
    public static void main(String[] args) {

        Cake cake1 = new CakeBuilder().setBakingpowder(10.10).setButter(20.1).setEggs(4).setMilk(2).setVanila(3).setSugar(10).setFlour(10).build();

        Cake cake2 = new CakeBuilder().setBakingpowder(20.10).setButter(30.1).setEggs(2).setMilk(1).setVanila(2).setSugar(20).setFlour(18).build();

        Cake cake3 = new CakeBuilder().setBakingpowder(20.10).setButter(30.1).setEggs(2).setMilk(1).setVanila(2).build();

        System.out.println(cake1);
        System.out.println(cake2);
        System.out.println(cake3);

    }
}
