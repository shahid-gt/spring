package com.springmvc.entities;

import javax.persistence.*;

@Entity
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "username")
    private String username;
    @Column(name = "email")
    private String email;
    @Column(name = "password")
    private String password;
    @Column(name = "mobile")
    private Long mobile;

    public User() {
    }

    public User(Long id, String username, String email, String password, Long mobile) {
        super();
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.mobile = mobile;
    }

    public Long getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public void setId(Long Id) {
        this.id = Id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    public Long getMobile() {
        return mobile;
    }

    @Override
    public String toString() {
        return "User{ username= " + username + " email= " + email + " password= " + password + " mobile= " + mobile;
    }
}
