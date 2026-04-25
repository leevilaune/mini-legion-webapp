package dev.onesnzeroes.minilegion.api.rune.request;

import dev.onesnzeroes.minilegion.api.role.RoleEntity;
import dev.onesnzeroes.minilegion.api.role.request.RoleModel;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class RuneModel {

    private Long id;
    private String name;
    private RoleModel role;
    private String commonEffect;
    private String rareEffect;
    private String epicEffect;
    private String legendaryEffect;

    public RuneModel(Long id, String name, String commonEffect, String rareEffect, String epicEffect, String legendaryEffect) {
        this.id = id;
        this.name = name;
        this.commonEffect = commonEffect;
        this.rareEffect = rareEffect;
        this.epicEffect = epicEffect;
        this.legendaryEffect = legendaryEffect;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleModel getRole() {
        return role;
    }

    public void setRole(RoleModel role) {
        this.role = role;
    }

    public String getCommonEffect() {
        return commonEffect;
    }

    public void setCommonEffect(String commonEffect) {
        this.commonEffect = commonEffect;
    }

    public String getRareEffect() {
        return rareEffect;
    }

    public void setRareEffect(String rareEffect) {
        this.rareEffect = rareEffect;
    }

    public String getEpicEffect() {
        return epicEffect;
    }

    public void setEpicEffect(String epicEffect) {
        this.epicEffect = epicEffect;
    }

    public String getLegendaryEffect() {
        return legendaryEffect;
    }

    public void setLegendaryEffect(String legendaryEffect) {
        this.legendaryEffect = legendaryEffect;
    }
}
