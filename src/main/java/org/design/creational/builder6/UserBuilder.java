package org.design.creational.builder6;

public class UserBuilder {

    private User user;
    private  String firstName; // required
    private  String lastName; // required
    private  int age; // optional
    private  String phone; // optional
    private  String address; // optional

    public UserBuilder(){
        this.user = new User();
    }
    public UserBuilder setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public UserBuilder setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public UserBuilder setAge(int age) {
        this.age = age;
        return this;
    }

    public UserBuilder setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public UserBuilder setAddress(String address) {
        this.address = address;
        return this;
    }

    public User build(){
        return new User(firstName,lastName,30,phone,address);
    }

}
