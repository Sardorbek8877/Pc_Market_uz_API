package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Category;
import uz.pcmarket.pcmarket.projection.CustomerCategory;

@RepositoryRestResource(path = "category", collectionResourceRel = "CategoryList", excerptProjection = CustomerCategory.class)
public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
