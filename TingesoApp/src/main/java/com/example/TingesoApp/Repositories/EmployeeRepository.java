package com.example.TingesoApp.Repositories;


import com.example.TingesoApp.Entities.EmployeeEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface EmployeeRepository extends CrudRepository<EmployeeEntity, String> {
}
