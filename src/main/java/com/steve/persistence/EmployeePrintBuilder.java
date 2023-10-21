package com.steve.persistence;

public class EmployeePrintBuilder {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public String printEmployee() {
        return name;
    }
}
