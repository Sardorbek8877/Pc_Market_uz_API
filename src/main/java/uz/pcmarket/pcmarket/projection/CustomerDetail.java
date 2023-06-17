package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Brand;
import uz.pcmarket.pcmarket.entity.Detail;
import uz.pcmarket.pcmarket.entity.Reviews;

import java.util.List;

@Projection(types = Detail.class)
public interface CustomerDetail {

    Integer getId();

    String getName();

    String getDescription();

    double getPrice();

    List<Reviews> getReviews();

    Brand getBrand();
}
