package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Sale;
import uz.pcmarket.pcmarket.projection.CustomerBrand;
import uz.pcmarket.pcmarket.projection.CustomerSale;

@RepositoryRestResource(path = "sale", collectionResourceRel = "SaleList", excerptProjection = CustomerSale.class)
public interface SaleRepository extends JpaRepository<Sale, Integer> {
}
