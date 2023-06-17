package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.ConfigPc;
import uz.pcmarket.pcmarket.projection.CustomerConfigPc;

@RepositoryRestResource(path = "configPc", excerptProjection = CustomerConfigPc.class)
public interface ConfigPcRepository extends JpaRepository<ConfigPc, Integer> {

}
