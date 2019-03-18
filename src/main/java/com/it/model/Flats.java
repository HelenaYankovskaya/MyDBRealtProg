package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Flats {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_flat;

    @OneToMany(mappedBy = "flats")
    private Set<Contracts> contracts;

    private String adress;
    private Double square;
    private Boolean is_balcon;
    private int number_of_rooms;
    private Long value;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "planing_id")
    private Planing planing;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "repair_id")
    private Repair repair;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "walls_id")
    private Walls walls;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "recommended_value_id"))
    private Recommended_value recommended_value;

    public Recommended_value getRecommended_value() {
        return recommended_value;
    }

    public void setRecommended_value(Recommended_value recommended_value) {
        this.recommended_value = recommended_value;
    }

    public Long getId_flat() {
        return id_flat;
    }

    public void setId_flat(Long id_flat) {
        this.id_flat = id_flat;
    }

    public Set<Contracts> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contracts> contracts) {
        this.contracts = contracts;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }

    public Boolean getIs_balcon() {
        return is_balcon;
    }

    public void setIs_balcon(Boolean is_balcon) {
        this.is_balcon = is_balcon;
    }

    public int getNumber_of_rooms() {
        return number_of_rooms;
    }

    public void setNumber_of_rooms(int number_of_rooms) {
        this.number_of_rooms = number_of_rooms;
    }

    public Long getValue() {
        return value;
    }

    public void setValue(Long value) {
        this.value = value;
    }

    public Planing getPlaning() {
        return planing;
    }

    public void setPlaning(Planing planing) {
        this.planing = planing;
    }

    public Repair getRepair() {
        return repair;
    }

    public void setRepair(Repair repair) {
        this.repair = repair;
    }

    public Walls getWalls() {
        return walls;
    }

    public void setWalls(Walls walls) {
        this.walls = walls;
    }
}
