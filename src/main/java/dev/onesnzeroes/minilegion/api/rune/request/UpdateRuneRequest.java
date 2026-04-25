package dev.onesnzeroes.minilegion.api.rune.request;

import jakarta.validation.constraints.NotNull;

public class UpdateRuneRequest {

    private String name;
    private Integer roleId;
    private String commonEffect;
    private String rareEffect;
    private String epicEffect;
    private String legendaryEffect;



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
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
