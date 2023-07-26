package org.design.creational.factory1;

import org.design.creational.factory1.Burger;
import org.design.creational.factory1.BurgerFactory;

import java.util.Scanner;

public class ClientBurgerOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the type of the burger");
        String type = sc.next();// 1.Veg 2.Chicken 3.Beef
        Burger b = BurgerFactory.getInstance(type);
        b.setFoodIngredients();
        b.make();
    }
}
