package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Walls {
    @Id
    @GeneratedValue
    private Long id_wall_material;

    @OneToMany(mappedBy = "walls")
    private Set<Flats> flats;

    private String wall_material;

    public Long getId_wall_material() {
        return id_wall_material;
    }

    public void setId_wall_material(Long id_wall_material) {
        this.id_wall_material = id_wall_material;
    }

    public String getWall_material() {
        return wall_material;
    }

    public Set<Flats> getFlats() {
        return flats;
    }

    public void setFlats(Set<Flats> flats) {
        this.flats = flats;
    }

    public void setWall_material(String wall_material) {
        this.wall_material = wall_material;
    }
}