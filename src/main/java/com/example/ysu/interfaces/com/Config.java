package com.example.ysu.interfaces.com;


import com.example.ysu.entitys.Dekan;

import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface Config {

    public List findAll();
    public List findBy();

    //@RequestMapping(value="/findBy/{id}")


    public void edit();
    public void insert();
}
