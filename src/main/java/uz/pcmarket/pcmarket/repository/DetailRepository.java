package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Detail;
import uz.pcmarket.pcmarket.projection.CustomerDetail;

@RepositoryRestResource(path = "detail", collectionResourceRel = "DetailList", excerptProjection = CustomerDetail.class)
public interface DetailRepository extends JpaRepository<Detail, Integer> {
}
