package com.example.ysu.models;

import com.example.ysu.entitys.Dekan;

/**
 * Created by Saqo on 21.09.2017.
 */
public class EditDekan {
    private Long id;
    private Dekan dekan;

    public EditDekan() {

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
