package com.crud.crud;

import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
public class EmpController {
   
      //Dependency Injection
    @Autowired
    EmployeeService employeeService;

    @GetMapping("employees")
    public List<Employee> getAllEmployees() {
        return employeeService.readEmployees();
    }

    @PostMapping("employees")
    public Employee postMethodName(@RequestBody Employee employee) {
       return employeeService.createEmployee(employee);
    }
    

    @DeleteMapping("employees/{id}")
    public Boolean deleteEmployee(@PathVariable Long id){
        return employeeService.deleteEmployee(id);
    }
    
}
