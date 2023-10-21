package com.steve.persistence;

public class EmployeeDatabaseImporter {
    private String name;
    public EmployeeDatabaseImporter(String name) {
        this.name = name;
    }

    public String provideName() {
        return name;
    }
}
