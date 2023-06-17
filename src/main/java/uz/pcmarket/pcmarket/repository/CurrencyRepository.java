package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Currency;
import uz.pcmarket.pcmarket.projection.CustomerCurrency;

@RepositoryRestResource(path = "currency", collectionResourceRel = "CurrencyList", excerptProjection = CustomerCurrency.class)
public interface CurrencyRepository extends JpaRepository<Currency, Integer> {
}
