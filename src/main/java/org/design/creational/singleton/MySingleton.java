package org.design.creational.singleton;

public enum MySingleton {
    INSTANCE;
    private MySingleton() {
        System.out.println("Here");
    }
}
