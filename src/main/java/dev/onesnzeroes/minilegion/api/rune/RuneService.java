package dev.onesnzeroes.minilegion.api.rune;

import dev.onesnzeroes.minilegion.api.common.error.exception.NotFoundException;
import dev.onesnzeroes.minilegion.api.role.RoleEntity;
import dev.onesnzeroes.minilegion.api.role.RoleMapper;
import dev.onesnzeroes.minilegion.api.role.RoleRepository;
import dev.onesnzeroes.minilegion.api.role.request.RoleModel;
import dev.onesnzeroes.minilegion.api.rune.request.CreateRuneRequest;
import dev.onesnzeroes.minilegion.api.rune.request.RuneModel;
import dev.onesnzeroes.minilegion.api.rune.request.UpdateRuneRequest;
import org.springframework.stereotype.Service;

@Service
public class RuneService {

    private RuneRepository runeRepository;
    private RoleRepository roleRepository;
    private RuneMapper runeMapper;
    private RoleMapper roleMapper;


    public RuneService(RuneRepository runeRepository,
                       RoleRepository roleRepository,
                       RuneMapper runeMapper,
                       RoleMapper roleMapper){
        this.runeRepository = runeRepository;
        this.roleRepository = roleRepository;
        this.runeMapper = runeMapper;
        this.roleMapper = roleMapper;
    }

    /**
     * Creates entity from request
     * @param createRequest create request object
     * @return the created model
     */
    public RuneModel create(CreateRuneRequest createRequest){
        RoleEntity role = this.roleRepository.findById(createRequest.getRoleId())
                .orElseThrow(()->new NotFoundException("Role not found"));
        RuneEntity entity = new RuneEntity(createRequest.getName(),
                role,
                createRequest.getCommonEffect(),
                createRequest.getRareEffect(),
                createRequest.getEpicEffect(),
                createRequest.getLegendaryEffect());
        entity = this.runeRepository.save(entity);
        return this.runeMapper.toModel(entity);
    }

    /**
     * Reads entity by id
     * @param id id of the entity
     * @return entity
     */
    public RuneModel read(Long id){
        RuneModel model =  this.runeMapper.toModel(this.runeRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Rune not found")));
        RoleModel role = this.roleMapper.toModel(this.roleRepository.findById(model.getRole().getId())
                .orElseThrow(()->new NotFoundException("Role not found")));
        model.setRole(role);
        return model;
    }

    /**
     * Update entity
     * @param updateRequest update request object
     * @return updated model
     */
    public RuneModel update(UpdateRuneRequest updateRequest){return null;}

    /**
     * Deletes entity by id
     * @param id id of the entity to delete
     * @return true if the deletion was successful, false otherwise
     */
    public boolean delete(Long id){
        RuneEntity entity = this.runeRepository.findById(id)
                .orElseThrow(()-> new NotFoundException("Rune doesnt exist"));
        this.runeRepository.delete(entity);
        return true;
    }
}
