package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Servise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id_servise;

    private String name_of_servise;

    @ManyToMany(cascade = {CascadeType.ALL}, fetch = FetchType.EAGER)
    @JoinTable(name = "Servise_Client",
            joinColumns = {@JoinColumn(name = "servise_id_servise")},
            inverseJoinColumns = {@JoinColumn(name = "client_id")})
    private Set<Client> client;



    public Set<Client> getClient() {
        return client;
    }

    public void setClient(Set<Client> clients) {
        this.client = clients;
    }

    public Long getId_servise() {
        return id_servise;
    }

    public void setId_servise(Long id_servise) {
        this.id_servise = id_servise;
    }

    public String getName_of_servise() {
        return name_of_servise;
    }

    public void setName_of_servise(String name_of_servise) {
        this.name_of_servise = name_of_servise;
    }
}





