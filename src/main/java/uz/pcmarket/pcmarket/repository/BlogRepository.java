package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Blog;
import uz.pcmarket.pcmarket.projection.CustomerBlog;

@RepositoryRestResource(path = "blog", collectionResourceRel = "BlogList", excerptProjection = CustomerBlog.class)
public interface BlogRepository extends JpaRepository<Blog, Integer> {
}
