package com.it.model;

import javax.persistence.*;
import java.util.Set;

@Entity
@Table
public class Realtor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String post;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumns(@JoinColumn(name = "user_id"))
    private User user;

    @OneToMany(mappedBy = "realtor")
    private Set<Contracts> contracts;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Contracts> getContracts() {
        return contracts;
    }

    public void setContracts(Set<Contracts> contracts) {
        this.contracts = contracts;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

}
