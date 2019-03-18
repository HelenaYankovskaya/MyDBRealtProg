package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String number_of_passport;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "user_id"))
    private User user;

    @ManyToMany(mappedBy = "client", fetch = FetchType.EAGER)
    private Set<Servise> servises;

    public Set<Servise> getServises() {
        return servises;
    }

    public void setServises(Set<Servise> servises) {
        this.servises = servises;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumber_of_passport() {
        return number_of_passport;
    }

    public void setNumber_of_passport(String number_of_passport) {
        this.number_of_passport = number_of_passport;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
