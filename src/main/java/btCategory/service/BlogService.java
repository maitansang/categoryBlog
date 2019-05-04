package btCategory.service;

import btCategory.model.Blog;
import btCategory.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public  interface BlogService {
    Page<Blog> findAllByContent(String content, Pageable pageable);
    Page<Blog> findAll(Pageable pageable);
    Blog findById(Long id);
    void save (Blog blog);
    void remove(Long id);
    Iterable<Blog> findAllByCategory(Category category);
}
