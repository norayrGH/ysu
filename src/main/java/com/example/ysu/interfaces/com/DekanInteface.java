package com.example.ysu.interfaces.com;

import com.example.ysu.entitys.Dekan;


import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;

@Repository
public interface DekanInteface extends CrudRepository<Dekan,Long> {
    @Modifying
    @Transactional


    @Query(value="  UPDATE dekan_tbl d " +
            "       JOIN facultat f ON" +
            " f.facultat_id=d.facultat_facultat_id      SET " +
            "           d.addres=:addres,"+
            "           d.phone=:phone," +
            "           d.email=:email," +
            "           d.fname=:fname," +
            "           d.lname=:lname," +
            "           f.name=:facultat" +
            "       WHERE d.facultat_facultat_id=:idee"
            ,nativeQuery = true)
    void update(@Param("idee")Long id,
                @Param("phone")String phone,
                @Param("addres")String addres,
                @Param("email") String email,
                @Param("fname") String fname,
                @Param("lname") String lname ,
                @Param("facultat") String facultat);

}
