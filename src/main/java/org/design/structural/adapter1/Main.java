package org.design.structural.adapter1;

public class Main {
    public static void main(String[] args) {

        Ceo ceo =new Ceo();
        System.out.println(ceo.getFullTitleAndName());


        ExecutiveEmployee e=new EmployeeAdapter(new Engineer());
        System.out.println(e.getFullTitleAndName());


    }
}
