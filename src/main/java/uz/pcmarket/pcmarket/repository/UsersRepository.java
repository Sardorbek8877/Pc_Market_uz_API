package uz.pcmarket.pcmarket.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pcmarket.pcmarket.entity.Users;
import uz.pcmarket.pcmarket.projection.CustomerUsers;

@RepositoryRestResource(path = "user", collectionResourceRel = "UserList", excerptProjection = CustomerUsers.class)
public interface UsersRepository extends JpaRepository<Users, Integer> {
}
