package org.design.creational.singleton;

import java.lang.reflect.Constructor;

public class ReflectionSingletonTest {
    public static void main(String[] args) {
        PrintSpooker printSpookerOne = PrintSpooker.getInstance();
        PrintSpooker printSpookerTwo = null;

        try{
            Constructor [] constructors = PrintSpooker.class.getDeclaredConstructors();
            for(Constructor constructor:constructors){
                constructor.setAccessible(true);
                printSpookerTwo = (PrintSpooker) constructor.newInstance();
                break;
            }
        }catch (Exception e){e.printStackTrace();}

        System.out.println("Instance 1:"+printSpookerOne.hashCode());
        System.out.println("Instance 2:"+printSpookerOne.hashCode());
    }
}
