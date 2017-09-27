package com.example.ysu.entitys;

import com.example.ysu.models.Standart;
import com.sun.xml.internal.bind.api.impl.NameConverter;

import javax.persistence.*;

@Entity(name = "dekan_tbl")
public class Dekan {

    @Id
    @Column(name="dekan_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @Embedded
    private Standart standart;

    @OneToOne(cascade=CascadeType.ALL)
    private Facultat facultat;




    public Dekan() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Standart getStandart() {
        return standart;
    }

    public void setStandart(Standart standart) {
        this.standart = standart;
    }

    public Facultat getFacultat() {
        return facultat;
    }

    public void setFacultat(Facultat facultat) {
        this.facultat = facultat;
    }
}
