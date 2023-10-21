package com.steve.persistence;

public class EmployeePrintBuilder implements com.steve.biz.ForExportingEmployees {
    String name;

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String printEmployee() {
        return name;
    }
}
