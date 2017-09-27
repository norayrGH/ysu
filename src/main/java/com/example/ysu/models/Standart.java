package com.example.ysu.models;


public class Standart extends com.example.ysu.entitys.Standart {
    private String fname;
    private String lname;
    private String Email;
    private String Phone;
    private String Addres;

    public Standart() {

    }

    public Standart(String fname, String lname, String email, String phone, String addres) {
        this.fname = fname;
        this.lname = lname;
        Email = email;
        Phone = phone;
        Addres = addres;
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

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAddres() {
        return Addres;
    }

    public void setAddres(String addres) {
        Addres = addres;
    }
}
