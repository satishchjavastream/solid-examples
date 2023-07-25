package org.design.creational.singleton;

public class PrintSpooker {
    private static final PrintSpooker spooker= new PrintSpooker();

    private PrintSpooker(){}

    public static synchronized PrintSpooker getInstance(){
        //if(spooker==null) {
           // spooker = new PrintSpooker();
        //}
        return spooker;
    }
}
