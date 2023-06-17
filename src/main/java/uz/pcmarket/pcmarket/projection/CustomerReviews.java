package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Currency;
import uz.pcmarket.pcmarket.entity.Reviews;

@Projection(types = Reviews.class)
public interface CustomerReviews {

    Integer getId();

    String getDescription();
}
