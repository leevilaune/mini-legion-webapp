package dev.onesnzeroes.minilegion.api.rune.request;

import dev.onesnzeroes.minilegion.api.role.request.RoleModel;
import jakarta.validation.constraints.NotNull;

public class CreateRuneRequest {

    @NotNull
    private String name;
    @NotNull
    private Long roleId;
    @NotNull
    private String commonEffect;
    @NotNull
    private String rareEffect;
    @NotNull
    private String epicEffect;
    @NotNull
    private String legendaryEffect;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getRoleId() {
        return roleId;
    }

    public void setRoleId(Long roleId) {
        this.roleId = roleId;
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
