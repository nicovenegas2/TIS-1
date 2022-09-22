package com.example.TingesoApp.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "employees")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeEntity {

    @Id
    @Column(unique = true, name = "id_employees")
    private String idEmployees;

    @Column(name = "name")
    String name;
    @Column(name = "id_category")
    long id_category;


}
