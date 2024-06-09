package com.crud.crud;

import java.util.List;

public interface EmployeeInteface {
    Employee createEmployee(Employee employee);

    List<Employee> readEmployees();

    boolean deleteEmployee(Long id);

    
}
