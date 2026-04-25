package dev.onesnzeroes.minilegion.api.role;

import dev.onesnzeroes.minilegion.api.role.request.RoleModel;
import org.springframework.stereotype.Component;

@Component
public class RoleMapper {

    public RoleModel toModel(RoleEntity entity){
        return new RoleModel(entity.getId(),entity.getName());
    }

    public RoleEntity toEntity(RoleModel model){
        return null;
    }
}
