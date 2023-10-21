package com.steve.persistence;

public class EmployeeDatabaseImporter implements com.steve.biz.ForImportingEmployees {
    private String name;
    public EmployeeDatabaseImporter(String name) {
        this.name = name;
    }

    @Override
    public String provideName() {
        return name;
    }
}
