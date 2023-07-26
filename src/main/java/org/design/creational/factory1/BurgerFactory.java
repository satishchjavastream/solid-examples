package org.design.creational.factory1;

public class BurgerFactory {

    public static Burger getInstance(String type){

        switch (type){
            case "1":
                System.out.println("I know you like Veg burger!!!");
                return new VegBurger();
            case "2":
                System.out.println("I know you like crispy Chicken burger!!!");
                return new ChickenBurger();
            case "3":
                System.out.println("I know you like yummy Beef burger!!!");
                return new BeafBurger();
        }
        return null;
    }
}
