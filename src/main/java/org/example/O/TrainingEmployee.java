package org.example.O;

public class TrainingEmployee extends Employee{

    private String trainingPlace;
    public TrainingEmployee(int id, String name,String trainingPlace) {
        super(id, name);
        this.trainingPlace = trainingPlace;
    }
}
