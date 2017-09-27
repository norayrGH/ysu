package com.example.ysu.interfaces.com;

import com.example.ysu.entitys.Facultat;
import com.example.ysu.entitys.Teacher;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javax.transaction.Transactional;
import java.util.List;

@Repository
public interface TeacherInterface extends CrudRepository<Teacher,Long> {
    @Modifying
    @Transactional
@Query(value="update teacher_tbl t JOIN facultat f SET t.fname=:fname , t.lname=:lname,t.addres=:addres,t.phone=:phone,t.email=:email,f.name=:facList WHERE t.teacher_id=:id", nativeQuery = true)
    void update(@Param("id") long id,@Param("facList") List<String> facultates, @Param("addres")String addres,@Param("email") String email, @Param("phone")String phone,@Param("fname") String fname, @Param("lname")String lname);
}
