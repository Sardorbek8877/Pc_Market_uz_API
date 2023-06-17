package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Category;
import uz.pcmarket.pcmarket.entity.Users;

@Projection(types = Category.class)
public interface CustomerCategory {

    Integer getId();

    String getName();
}
