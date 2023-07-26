package org.design.creational.builder6;

public class UserClient {
    public static void main(String[] args) {
        User user = new UserBuilder().setFirstName ("Satish").setLastName("Ch").setAge(30).setPhone("9373927392").setAddress("macdway texas").build();

        System.out.println(user);
    }
}
