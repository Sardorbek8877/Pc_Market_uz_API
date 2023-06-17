package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Brand;
import uz.pcmarket.pcmarket.entity.Category;
import uz.pcmarket.pcmarket.entity.Currency;
import uz.pcmarket.pcmarket.entity.Product;

@Projection(types = Product.class)
public interface CustomerProduct {

    Integer getId();

    String getDescription();

    String getPrice();

    Category getCategory();

    Brand getBrand();

    Currency getCurrency();
}
