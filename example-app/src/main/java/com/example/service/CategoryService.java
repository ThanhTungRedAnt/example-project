package com.example.service;

import com.example.domain.Category;
import com.example.repository.CategoryRepository;
import com.example.service.dto.CategoryDTO;
import com.example.service.mapper.CategoryMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

/**
 * Service class for managing users.
 */
@Service
@Transactional
public class CategoryService {
    @Autowired
    CategoryMapper categoryMapper;

    @Autowired
    EntityManager entityManager;


    private final Logger log = LoggerFactory.getLogger(CategoryService.class);

    private final CategoryRepository categoryRepository;


    public CategoryService(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<CategoryDTO> getAllCategory() {
        List<Category> categories = categoryRepository.findAll();
        //Map category to categoryDTO
        List<CategoryDTO> categoryDTOS = categoryMapper.toDto(categories);
        List<CategoryDTO> result = new ArrayList<>();
        result.addAll(categoryDTOS);
        return result;
    }


}
