package org.design.creational.singleton;

public class BillPughSingleton {
    private BillPughSingleton(){}

    private static class SingleTonHelper{
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

    public static BillPughSingleton getInstance(){
        return SingleTonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton billPughSingleton = SingleTonHelper.INSTANCE;
        BillPughSingleton billPughSingleton1 = BillPughSingleton.getInstance();

        System.out.println("billPughSingleton :"+billPughSingleton.hashCode());
        System.out.println("billPughSingleton1 :"+billPughSingleton1.hashCode());

    }

}
