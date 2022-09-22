package com.example.TingesoApp.Repositories;

import com.example.TingesoApp.Entities.CategoryEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends CrudRepository<CategoryEntity, String> {
}
