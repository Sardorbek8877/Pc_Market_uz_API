package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Detail;
import uz.pcmarket.pcmarket.entity.Product;
import uz.pcmarket.pcmarket.projection.CustomerDetail;
import uz.pcmarket.pcmarket.projection.CustomerProduct;

@RepositoryRestResource(path = "product", collectionResourceRel = "ProductList", excerptProjection = CustomerProduct.class)
public interface ProductRepository extends JpaRepository<Product, Integer> {
}
