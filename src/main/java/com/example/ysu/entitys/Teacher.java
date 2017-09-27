package com.example.ysu.entitys;

import javax.persistence.*;
import java.util.List;

@Entity(name = "teacher_tbl")
public class Teacher {
    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Embedded
    private Standart standart;

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable
            (
                    name="techer_join_fac",
                    joinColumns={ @JoinColumn(name="teacher_id", referencedColumnName="teacher_id") },
                    inverseJoinColumns={ @JoinColumn(name="fac_id", referencedColumnName="facultat_id", unique=true) }
            )    private List<Facultat> facultatList;

    public Teacher() {

    }

    public Teacher(Standart standart, List<Facultat> facultatList) {
        this.standart = standart;
        this.facultatList = facultatList;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Standart getStandart() {
        return standart;
    }

    public void setStandart(Standart standart) {
        this.standart = standart;
    }

    public List<Facultat> getFacultatList() {
        return facultatList;
    }

    public void setFacultatList(List<Facultat> facultatList) {
        this.facultatList = facultatList;
    }
}
