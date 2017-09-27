package com.example.ysu.controllers;

import com.example.ysu.models.Standart;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;




@Controller
public class StertController {


    @RequestMapping("/")
    public String return_index(){

        return "/index.html";
    }

}
