package org.design.creational.builder4;

public class JuiceClient {

    public static void main(String[] args) {
        Juice mango = new JuiceBuilder().setJuicename("Mango").setFruit(1).setIcecube(1).setSugar(1).setWater(1).build();

        Juice orange = new JuiceBuilder().setJuicename("Orange").setFruit(2).setIcecube(1).setSugar(2).setWater(1).build();


        System.out.println(mango);
        System.out.println(orange);

    }

}
