package com.example.ysu.controllers;

import com.example.ysu.entitys.Dekan;
import com.example.ysu.interfaces.com.Config;
import com.example.ysu.interfaces.com.StudentInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RequestMapping("/student")

@RestController

public class StudentControler implements Config {

    @Autowired
    StudentInterface studentInterface;

    @RequestMapping("/findall")
    @Override
    public List findAll(){

        return (List) studentInterface.findAll() ;
    }

    @Override
    public List findBy() {
        return null;
    }



    @RequestMapping("/edit")
    @Override
    public void edit(){




    }
    @RequestMapping("/insert")
    @Override

    public void insert(){


    }
}
