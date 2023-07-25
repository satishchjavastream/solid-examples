package org.design.creational.singleton;

public class EnumSingleton {
    public static void main(String[] args) {
        System.out.println(MySingleton.INSTANCE.hashCode());
    }
}

