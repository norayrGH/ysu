package com.example.ysu.entitys;

import javax.persistence.*;

/**
 * Created by Saqo on 20.09.2017.
 */
@Entity(name ="student_tbl" )
public class Student {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Embedded
    private Standart standart;

    private int pension ;
    private int payment;
    private boolean discount;

}
