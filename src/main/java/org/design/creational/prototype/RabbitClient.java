package org.design.creational.prototype;

public class RabbitClient {
    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.setAge(8);
        rabbit.setOwner(new Person("Satish"));
        Rabbit rabbitCopy = rabbit.clone();
        System.out.println("Age of the first data base:"+rabbit.getAge()+" name:"+rabbit.getOwner().getName());
        System.out.println("Age of the second data base:"+rabbitCopy.getAge()+" name:"+rabbitCopy.getOwner().getName());
        rabbitCopy.getOwner().setName("Ramesh");
        System.out.println(" name1:"+rabbit.getOwner().getName());
        System.out.println(" name2:"+rabbitCopy.getOwner().getName());
    }
}
