package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Reviews;
import uz.pcmarket.pcmarket.projection.CustomerReviews;

@RepositoryRestResource(path = "reviews", collectionResourceRel = "ReviewsList", excerptProjection = CustomerReviews.class)
public interface ReviewsRepository extends JpaRepository<Reviews, Integer> {
}
