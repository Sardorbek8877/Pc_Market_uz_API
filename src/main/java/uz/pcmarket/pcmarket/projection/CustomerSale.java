package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Product;
import uz.pcmarket.pcmarket.entity.Sale;

@Projection(types = Sale.class)
public interface CustomerSale {

    Integer getId();

    double getSalePrice();

    Product getProduct();
}
