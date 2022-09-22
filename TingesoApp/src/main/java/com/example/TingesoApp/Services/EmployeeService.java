package com.example.TingesoApp.Services;


import com.example.TingesoApp.Entities.EmployeeEntity;
import com.example.TingesoApp.Repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class EmployeeService {
    @Autowired
    EmployeeRepository employeeRepository;

    public EmployeeService(){

    }
    public ArrayList<EmployeeEntity> getEmployees(){
        return (ArrayList) employeeRepository.findAll();
    }

}
