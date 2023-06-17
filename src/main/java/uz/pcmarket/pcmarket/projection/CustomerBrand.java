package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Brand;
import uz.pcmarket.pcmarket.entity.Users;

@Projection(types = Brand.class)
public interface CustomerBrand {

    Integer getId();

    String getName();

    String getDescription();
}
