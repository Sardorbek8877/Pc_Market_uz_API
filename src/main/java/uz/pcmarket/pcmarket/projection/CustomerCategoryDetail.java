package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.CategoryDetail;
import uz.pcmarket.pcmarket.entity.Detail;

import java.util.List;

@Projection(types = CategoryDetail.class)
public interface CustomerCategoryDetail {

    Integer getId();

    String getName();

    Detail getDetail();
}
