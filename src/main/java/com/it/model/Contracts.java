package com.it.model;

import javax.persistence.*;

@Entity
@Table
public class Contracts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_contract;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "flats_id")
    private Flats flats;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "realtor_id")
    private Realtor realtor;

    private String data_contract;

    public Flats getFlats() {
        return flats;
    }

    public void setFlats(Flats flats) {
        this.flats = flats;
    }

    public Long getId_contract() {
        return id_contract;
    }

    public void setId_contract(Long id_contract) {
        this.id_contract = id_contract;
    }

    public String getData_contract() {
        return data_contract;
    }

    public void setData_contract(String data_contract) {
        this.data_contract = data_contract;
    }
}
