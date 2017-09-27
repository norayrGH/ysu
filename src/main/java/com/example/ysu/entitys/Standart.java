package com.example.ysu.entitys;


import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class Standart {

    @Column
    private String fname;
    @Column

    private String lname;
    @Column

    private String phone;
    @Column

    private String email;
    @Column

    private String addres;

    public Standart() {

    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }
}
