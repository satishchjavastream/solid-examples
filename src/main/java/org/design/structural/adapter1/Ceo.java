package org.design.structural.adapter1;

public class Ceo implements ExecutiveEmployee{
    @Override
    public String getFullTitleAndName() {
        return "Dr. John Doe, CEO";
    }
}
