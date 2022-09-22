package com.example.TingesoApp.Repositories;

import com.example.TingesoApp.Entities.DateEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DateRepository extends CrudRepository<DateEntity , Long> {

}
