package org.solid.O;

public class Employee {
    private int id;
    private String name;
    //private Address;
    //private String trainingPlace;


    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public void printMe(){
        System.out.println("Employee id:"+id+" Name:"+name);
    }

   /* private String address1;
    private String address2;
    private String State;
    private String City;*/

}
