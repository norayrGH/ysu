package com.example.ysu.controllers;

import com.example.ysu.entitys.Dekan;
import com.example.ysu.entitys.Pictuare;
import com.example.ysu.interfaces.com.DekanInteface;
import com.example.ysu.interfaces.com.PictuareInterface;
import com.example.ysu.models.EditDekan;
import com.example.ysu.models.JsonDekan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@RequestMapping("/dekan")

@Controller

public class DekanControler {

    @Autowired
    DekanInteface dekanInteface;
    @Autowired
    PictuareInterface pictuareInterface;


    @RequestMapping("/update")
    public void update(@RequestBody EditDekan editDekan){
       Dekan dekan=  dekanInteface.findOne(editDekan.getId());
       dekan.setStandart(editDekan.getDekan().getStandart());
       dekan.setFacultat(editDekan.getDekan().getFacultat());
       dekanInteface.save(dekan);
    }
    @RequestMapping(value = "/findall")
    @ResponseBody
    public List findAll() {


        return (List) dekanInteface.findAll();
    }


    @RequestMapping(value = "/edit", method = RequestMethod.POST)
    public @ResponseBody
    void edit(@RequestBody EditDekan editDekan ) {
        System.out.println(editDekan.getDekan());
        System.out.println(editDekan.getId());
        List<Dekan> dekanList = (List<Dekan>) dekanInteface.findAll();
        for (int i = 0; i < dekanList.size(); i++) {
            if (editDekan.getId() == (dekanList.get(i).getId())) {

                Dekan dekan;

                dekan = editDekan.getDekan();

                dekanInteface.update(editDekan.getId(), dekan.getStandart().getPhone(), dekan.getStandart().getAddres(),
                        dekan.getStandart().getEmail(), dekan.getStandart().getFname(), dekan.getStandart().getLname(),
                        dekan.getFacultat().getName());
            }


        }
    }

    @RequestMapping(value = "/insert", method = RequestMethod.POST)
    public @ResponseBody
    void insert(@RequestBody JsonDekan jsonDekan) {

        Dekan dekan = new Dekan();

        dekan.setStandart(jsonDekan.getStandart());
        dekan.setFacultat(jsonDekan.getFacultat());
        System.out.println(jsonDekan.getFacultat().getName());
        dekanInteface.save(dekan);
    }

    @RequestMapping(value = "/addpictuare")
    public String handleFileUpload(@RequestParam("file") MultipartFile file, @RequestParam("id") String id) {
        String fileName = file.getOriginalFilename();
        String fileRealName = UUID.randomUUID().toString() + "_" + fileName;
        try {

            String nkarnerPath = new ClassPathResource("/public/").getFile().getPath();
            System.out.println(nkarnerPath);
            file.transferTo(new File(nkarnerPath+File.separator+ fileRealName));
            Pictuare pictuare = new Pictuare();
            pictuare.setData(fileRealName);
            pictuare.setDekan(dekanInteface.findOne(Long.valueOf(id)));
            pictuareInterface.save(pictuare);
            return "evrithing is og";
        } catch (IOException e) {
            e.printStackTrace();
            return "something is wrong";
        }


    }

       @RequestMapping(value = "/getpicture",  method = RequestMethod.POST)
       public @ResponseBody
       Pictuare handleFileUpload(@RequestBody String id) {
       Pictuare pictuare= pictuareInterface.findOne(Long.valueOf(id));
       System.out.println(pictuare);
       return pictuare;
   }
}
