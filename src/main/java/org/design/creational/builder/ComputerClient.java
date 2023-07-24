package org.design.creational.builder;

public class ComputerClient {
    public static void main(String[] args) {
        Computer computer = new ComputerBuilder().setHDD("1TB").setRAM("16GB").build();

        Computer computer1 = new ComputerBuilder().setHDD("500GB").setRAM("24GB").build();

        System.out.println(computer);

    }
}
