package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Basket;
import uz.pcmarket.pcmarket.projection.CustomerBasket;
import uz.pcmarket.pcmarket.projection.CustomerBlog;

@RepositoryRestResource(path = "basket", collectionResourceRel = "BasketList", excerptProjection = CustomerBasket.class)
public interface BasketRepository extends JpaRepository<Basket, Integer> {
}
