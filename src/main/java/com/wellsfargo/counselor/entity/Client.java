package com.wellsfargo.counselor.entity;

import jakarta.persistence.*;

@Entity
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    // Constructor
    public Client(String name) {
        this.name = name;
    }

    // Default constructor (IMPORTANT)
    public Client() {}

    // Getter for id
    public Long getId() {
        return id;
    }

    // Getter & Setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}