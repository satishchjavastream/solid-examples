package org.design.creational.prototype;

public class Person implements Cloneable{
    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public Person clone(){
        try{
            return (Person) super.clone();
        }catch (CloneNotSupportedException c){
            throw new AssertionError();
        }
    }
}
