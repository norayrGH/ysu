package com.example.ysu.entitys;

import javax.persistence.*;

@Entity
public class Pictuare {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    String data;

    @ManyToOne(cascade= CascadeType.ALL)
    Dekan dekan;


    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Dekan getDekan() {
        return dekan;
    }

    public void setDekan(Dekan dekan) {
        this.dekan = dekan;
    }
}
