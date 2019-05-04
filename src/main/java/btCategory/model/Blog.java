package btCategory.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="blogs")

public class Blog {
    @DateTimeFormat(pattern = "MM/dd/yyyy hh:mm:ss")
    private Date date= new Date();


    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String content;

    @ManyToOne
    @JoinColumn(name="category_id")
    private Category category;

    public Blog() {
    }

    public Blog(Date date, String content, Category category) {
        this.date = date;
        this.content = content;
        this.category = category;
    }

    @Override
    public String toString (){
        return String.format("Blog[id=%d, content='%s']",id,content);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }
}
