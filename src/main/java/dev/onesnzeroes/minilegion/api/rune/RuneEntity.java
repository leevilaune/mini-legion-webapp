package dev.onesnzeroes.minilegion.api.rune;

import dev.onesnzeroes.minilegion.api.role.RoleEntity;
import jakarta.persistence.*;

@Entity
@Table(name="rune")
public class RuneEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @ManyToOne
    private RoleEntity role;
    private String commonEffect;
    private String rareEffect;
    private String epicEffect;
    private String legendaryEffect;

    public RuneEntity(){}

    public RuneEntity(String name, RoleEntity role, String commonEffect, String rareEffect, String epicEffect, String legendaryEffect) {
        this.name = name;
        this.role = role;
        this.commonEffect = commonEffect;
        this.rareEffect = rareEffect;
        this.epicEffect = epicEffect;
        this.legendaryEffect = legendaryEffect;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RoleEntity getRole() {
        return role;
    }

    public void setRole(RoleEntity role) {
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
