package com.crud.crud;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
@Service
public class 
EmployeeService implements EmployeeInteface {
    List<Employee> employees=new ArrayList<Employee>();
   
    @Override
    public Employee createEmployee(Employee employee) {
       employees.add(employee);
        return employee;
    }

    @Override
    public List<Employee> readEmployees() {
       return employees;
    }
    
    @Override
    public boolean deleteEmployee(Long id) {
     employees.remove(id);
     return true;
    }
}
