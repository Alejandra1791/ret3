package com.g11.reto3.repository;

import com.g11.reto3.Entetities.Category;
import com.g11.reto3.repository.crudRepository.CategoryCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

public class CategoryRepository {
        @Autowired
        private CategoryCrudRepository categoryCrudRepository;

        public List<Category> getAll(){
            return(List<Category>) categoryCrudRepository.findAll();
        }
        public Optional<Category> getCategory(int id){
            return categoryCrudRepository.findById(id);
        }
        public Category save(Category category){
            return categoryCrudRepository.save(category);

        }
}