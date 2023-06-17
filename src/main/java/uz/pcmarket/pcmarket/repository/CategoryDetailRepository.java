package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.CategoryDetail;
import uz.pcmarket.pcmarket.projection.CustomerCategoryDetail;

@RepositoryRestResource(path = "categoryDetail", excerptProjection = CustomerCategoryDetail.class)
public interface CategoryDetailRepository extends JpaRepository<CategoryDetail, Integer> {
}
