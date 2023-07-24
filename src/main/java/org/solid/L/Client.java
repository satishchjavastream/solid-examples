package org.solid.L;

public class Client {
    public static void main(String[] args) {
        Employee e = new Employee(1,"Satish");

        org.solid.L.TrainingEmployee temployee = new TrainingEmployee(1,"Ram","Vizag");

        Client client = new Client();
        client.useMePrintYourData(e);
        client.useMePrintYourData(temployee);

    }
     void useMePrintYourData(Employee e){
       e.printMe();
    }
}
