package org.example.O;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Satish");
        e.printMe();

        TrainingEmployee temployee = new TrainingEmployee(1,"Ram","Vizag");
        temployee.printMe();

    }
}
