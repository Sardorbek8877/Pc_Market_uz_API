package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Basket;
import uz.pcmarket.pcmarket.entity.Product;
import uz.pcmarket.pcmarket.entity.Users;

import java.util.List;

@Projection(types = Basket.class)
public interface CustomerBasket {

    Integer getId();

    Users getUser();

    List<Product> getProduct();
}
