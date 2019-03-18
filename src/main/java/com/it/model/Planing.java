package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Planing {
    @Id
    @GeneratedValue
    private Long id_planing;

    @OneToMany(mappedBy = "planing")
    private Set<Flats> flats;

    private String type_of_planing;



    public Long getId_planing() {
        return id_planing;
    }

    public void setId_planing(Long id_planing) {
        this.id_planing = id_planing;
    }

    public Set<Flats> getFlats() {
        return flats;
    }

    public void setFlats(Set<Flats> flats) {
        this.flats = flats;
    }

    public String getType_of_planing() {
        return type_of_planing;
    }

    public void setType_of_planing(String type_of_planing) {
        this.type_of_planing = type_of_planing;
    }
}
