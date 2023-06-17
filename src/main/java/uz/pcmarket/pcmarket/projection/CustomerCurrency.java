package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Currency;

@Projection(types = Currency.class)
public interface CustomerCurrency {

    Integer getId();

    String getName();
}
