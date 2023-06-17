package uz.pcmarket.pcmarket.projection;

import org.springframework.data.rest.core.config.Projection;
import uz.pcmarket.pcmarket.entity.ConfigPc;
import uz.pcmarket.pcmarket.entity.TypeConfig;

import java.util.List;

@Projection(types = ConfigPc.class)
public interface CustomerConfigPc {

    Integer getId();

    TypeConfig getTypeConfig();
}
