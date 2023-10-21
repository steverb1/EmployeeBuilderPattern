package com.steve.biz;

import com.steve.persistence.EmployeeDatabaseImporter;
import com.steve.persistence.EmployeePrintBuilder;

public class Employee {
    private String name;

    public Employee(EmployeeDatabaseImporter importer) {
        name = importer.provideName();
    }

    public void exportTo(EmployeePrintBuilder builder) {
        builder.setName(name);
    }
}
