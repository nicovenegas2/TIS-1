package com.example.TingesoApp.Entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;


@Entity
@Table(name = "dates")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DateEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    Long id;

    Date date;
    Time entry_time;
    Time exit_time;
    boolean justification;
    int extra_hours;
    String id_employee;
}
