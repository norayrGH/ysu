package com.example.ysu.models;

import com.example.ysu.entitys.Facultat;

/**
 * Created by Saqo on 21.09.2017.
 */
public class JsonDekan {
    private Standart standart;
    private Facultat facultat;

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
