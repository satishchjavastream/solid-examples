package org.design.structural.adapter1;

public class EmployeeAdapter implements ExecutiveEmployee{
    private Employee e;

    public EmployeeAdapter(Employee e) {
        this.e = e;
    }

    @Override
    public String getFullTitleAndName() {
        return e.getName()+" "+e.getJobTitle();
    }
}
