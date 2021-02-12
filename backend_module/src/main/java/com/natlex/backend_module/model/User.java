package com.natlex.backend_module.model;

import javax.persistence.*;

@Entity
@Table (name = "User")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(nullable = false)
    private Long id;

    private String email;
    private boolean inAdmin;
    private String authData;

    public User() {
    }

    public User(Long id, String email, boolean inAdmin, String authData) {
        this.id = id;
        this.email = email;
        this.inAdmin = inAdmin;
        this.authData = authData;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isInAdmin() {
        return inAdmin;
    }

    public void setInAdmin(boolean inAdmin) {
        this.inAdmin = inAdmin;
    }

    public String getAuthData() {
        return authData;
    }

    public void setAuthData(String authData) {
        this.authData = authData;
    }
}
