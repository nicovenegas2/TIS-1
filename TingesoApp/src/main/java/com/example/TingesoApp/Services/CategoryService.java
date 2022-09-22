package com.example.TingesoApp.Services;

import com.example.TingesoApp.Entities.CategoryEntity;
import com.example.TingesoApp.Repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class CategoryService {
    @Autowired
    CategoryRepository categoryRepository;

    public ArrayList<CategoryEntity> getCategories(){
        return (ArrayList<CategoryEntity>) categoryRepository.findAll();
    }

}
