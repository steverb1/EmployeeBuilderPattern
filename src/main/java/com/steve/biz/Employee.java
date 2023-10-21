package com.steve.biz;

public class Employee {
    private String name;

    public Employee(ForImportingEmployees importer) {
        name = importer.provideName();
    }

    public void exportTo(ForExportingEmployees builder) {
        builder.setName(name);
    }
}
