package btCategory.service.impl;


import btCategory.model.Category;

import btCategory.repository.CategoryRepository;
import btCategory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;

public class CategoryServiceImpl implements CategoryService {
    @Autowired
    CategoryRepository categoryRepository;
    @Override
    public Iterable<Category> findAll() {
    return categoryRepository.findAll();
    }

    @Override
    public Category findById(Long id) {
      return   categoryRepository.findOne(id);
    }

    @Override
    public void save(Category author) {
        categoryRepository.save(author);
    }

    @Override
    public void remove(Long id) {
        categoryRepository.delete(id);
    }
}
