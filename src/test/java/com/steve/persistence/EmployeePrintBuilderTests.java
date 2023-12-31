package com.steve.persistence;

import com.steve.biz.Employee;
import com.steve.biz.ForExportingEmployees;
import com.steve.biz.ForImportingEmployees;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class EmployeePrintBuilderTests {
    @Test
    void employeePrintsCorrectly() {
        ForImportingEmployees importer = new EmployeeDatabaseImporter("Bob");
        Employee employee = new Employee(importer);

        ForExportingEmployees builder = new EmployeePrintBuilder();
        employee.exportTo(builder);
        String employeeString = builder.printEmployee();
        assertThat(employeeString).isEqualTo("Bob");
    }
}
