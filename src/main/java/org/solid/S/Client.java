package org.solid.S;

import org.solid.O.TrainingEmployee;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Satish");
        e.printMe();

        TrainingEmployee temployee = new TrainingEmployee(2,"Ramesh","Vizag");
        temployee.printMe();
    }
}
