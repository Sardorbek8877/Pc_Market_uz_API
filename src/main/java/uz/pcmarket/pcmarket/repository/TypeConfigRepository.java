package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.TypeConfig;
import uz.pcmarket.pcmarket.projection.CustomerTypeConfig;

@RepositoryRestResource(path = "typeConfig", excerptProjection = CustomerTypeConfig.class)
public interface TypeConfigRepository extends JpaRepository<TypeConfig, Integer> {
}
