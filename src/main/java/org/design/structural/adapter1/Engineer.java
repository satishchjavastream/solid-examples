package org.design.structural.adapter1;

public class Engineer implements Employee{
    @Override
    public String getJobTitle() {
        return "Software Engineer";
    }

    @Override
    public String getName() {
        return "Jane Doe";
    }
}
