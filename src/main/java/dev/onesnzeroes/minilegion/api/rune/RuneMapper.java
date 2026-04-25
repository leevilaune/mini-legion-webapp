package dev.onesnzeroes.minilegion.api.rune;

import dev.onesnzeroes.minilegion.api.rune.request.CreateRuneRequest;
import dev.onesnzeroes.minilegion.api.rune.request.RuneModel;
import org.springframework.stereotype.Component;

@Component
public class RuneMapper {

    public RuneEntity toEntity(RuneModel model){

        return null;
    }

    public RuneModel toModel(RuneEntity entity){
        return new RuneModel(entity.getId(),
                entity.getName(),
                entity.getCommonEffect(),
                entity.getRareEffect(),
                entity.getEpicEffect(),
                entity.getLegendaryEffect());
    }

}
