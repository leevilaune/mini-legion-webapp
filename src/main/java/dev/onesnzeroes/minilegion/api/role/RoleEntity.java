package dev.onesnzeroes.minilegion.api.role;

import dev.onesnzeroes.minilegion.api.rune.RuneEntity;
import jakarta.persistence.*;

import java.util.Set;

@Entity
@Table(name = "role")
public class RoleEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "role")
    private Set<RuneEntity> runes;

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

    public Set<RuneEntity> getRunes() {
        return runes;
    }

    public void setRunes(Set<RuneEntity> runes) {
        this.runes = runes;
    }
}