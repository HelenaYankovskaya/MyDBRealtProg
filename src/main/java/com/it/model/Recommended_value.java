package com.it.model;

import javax.persistence.*;

@Entity
@Table
public class Recommended_value {
    @Id
    @GeneratedValue
    private Long id_recommended_value;

    @OneToOne(mappedBy = "recommended_value")
    private Flats flats;

    private String recommended_value;

    public Flats getFlats() {
        return flats;
    }

    public void setFlats(Flats flats) {
        this.flats = flats;
    }

    public Long getId_recommended_value() {
        return id_recommended_value;
    }

    public void setId_recommended_value(Long id_recommended_value) {
        this.id_recommended_value = id_recommended_value;
    }

    public String getRecommended_value() {
        return recommended_value;
    }

    public void setRecommended_value(String recommended_value) {
        this.recommended_value = recommended_value;
    }
}
