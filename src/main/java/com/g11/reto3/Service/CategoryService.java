package com.g11.reto3.Service;

import com.g11.reto3.Entetities.Category;
import com.g11.reto3.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CategoryService {
    @Autowired
  private CategoryRepository categoryRepository;

    public List<Category> getAll() {
        return categoryRepository.getAll();
    }

    public Optional<Category> getCategory(int categoryId) {
        return categoryRepository.getCategory(categoryId);
    }

    public Category save(Category category) {
        if (category.getId() == null) {
            return categoryRepository.save(category);
        } else {
            Optional<Category> e = categoryRepository.getCategory(category.getId());
            if (e.isPresent()) { // no me deja el .is Empty
                return categoryRepository.save(category);
            } else {
                return category;
            }
        }
    }
}

