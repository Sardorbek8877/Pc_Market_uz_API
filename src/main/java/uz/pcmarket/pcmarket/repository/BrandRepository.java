package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Brand;
import uz.pcmarket.pcmarket.projection.CustomerBrand;

@RepositoryRestResource(path = "brand", collectionResourceRel = "BrandList", excerptProjection = CustomerBrand.class)
public interface BrandRepository extends JpaRepository<Brand, Integer> {
}
