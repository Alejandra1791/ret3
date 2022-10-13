package com.g11.reto3.Controller;

import java.util.List;
        import java.util.Optional;

import com.g11.reto3.Entetities.Category;
import com.g11.reto3.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/Category")

public class CategoryController {
    @Autowired
    private CategoryService categoryService;

    @GetMapping("/all")
    public List<Category> getCategorys(){
        return categoryService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Category> getCategory(@PathVariable("id") int categoryId) {
        return categoryService.getCategory(categoryId);
    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Category save(@RequestBody Category category) {

        return categoryService.save(category);
    }

    }



