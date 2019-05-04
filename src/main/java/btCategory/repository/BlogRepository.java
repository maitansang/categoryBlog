package btCategory.repository;



import btCategory.model.Blog;


import btCategory.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;




public interface BlogRepository extends PagingAndSortingRepository<Blog, Long> {
    Iterable<Blog> findAllByCategory(Category category);
    Page<Blog> findAllByContent(String content, Pageable pageable);
}
