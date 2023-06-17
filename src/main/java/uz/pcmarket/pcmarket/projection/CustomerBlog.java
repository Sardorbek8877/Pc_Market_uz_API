package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Blog;

@Projection(types = Blog.class)
public interface CustomerBlog {

    Integer getId();

    String getDescription();

    String getText();
}
