package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Repair {
    @Id
    @GeneratedValue
    private Long id_repair;

    @OneToMany(mappedBy = "repair")
    private Set<Flats> flats;

    private String type_of_repair;

    public Long getId_repair() {
        return id_repair;
    }

    public void setId_repair(Long id_repair) {
        this.id_repair = id_repair;
    }

    public Set<Flats> getFlats() {
        return flats;
    }

    public void setFlats(Set<Flats> flats) {
        this.flats = flats;
    }

    public String getType_of_repair() {
        return type_of_repair;
    }

    public void setType_of_repair(String type_of_repair) {
        this.type_of_repair = type_of_repair;
    }
}
