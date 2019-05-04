package btCategory.formatter;


import btCategory.model.Category;

import btCategory.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class CategoryFormatter implements Formatter<Category> {
    private CategoryService categoryService;
    @Autowired
    public CategoryFormatter(CategoryService categoryService){
        this.categoryService=categoryService;
    }
    public Category parse(String text, Locale locale) throws ParseException{
        return categoryService.findById(Long.parseLong(text)) ;
    }
    @Override
    public String print(Category object, Locale locale){
        return "[" + object.getId() + ", " +object.getType() + "]";
    }
}
