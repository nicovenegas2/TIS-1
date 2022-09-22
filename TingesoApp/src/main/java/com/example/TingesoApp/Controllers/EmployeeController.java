package com.example.TingesoApp.Controllers;


import com.example.TingesoApp.Entities.EmployeeEntity;
import com.example.TingesoApp.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Controller
@RequestMapping
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @GetMapping("/employees")
    public String employees(Model model){
        ArrayList<EmployeeEntity>employees = employeeService.getEmployees();
        System.out.println(employees.size());
        model.addAttribute("employees",employees);
        for (EmployeeEntity employee:employees) {
            System.out.println(employee.getIdEmployees());
        }
        return "employees";
    }
}
