package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.TypeConfig;

import java.util.List;

@Projection(types = TypeConfig.class)
public interface CustomerTypeConfig {

    Integer getId();

    String getName();

    List<TypeConfig> getTypeConfig();
}
