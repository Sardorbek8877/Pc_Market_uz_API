package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.Users;

@Projection(types = Users.class)
public interface CustomerUsers {

    Integer getId();

    String getName();

    String getAddress();

    String getPhoneNumber();
}
