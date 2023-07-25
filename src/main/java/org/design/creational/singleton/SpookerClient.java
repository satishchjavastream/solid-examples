package org.design.creational.singleton;

public class SpookerClient {
    public static void main(String[] args) {
        PrintSpooker printSpooker = PrintSpooker.getInstance();
        PrintSpooker printSpooker1 = PrintSpooker.getInstance();

        System.out.println("Print Spooker :"+printSpooker.hashCode());
        System.out.println("Print Spooker1 :"+printSpooker1.hashCode());

        Thread t1 = new Thread(()->{PrintSpooker s=PrintSpooker.getInstance();
            System.out.println(s.hashCode());});

        Thread t2 = new Thread(()->{PrintSpooker s=PrintSpooker.getInstance();
            System.out.println(s.hashCode());});

        t1.start();
        t2.start();

    }
}
