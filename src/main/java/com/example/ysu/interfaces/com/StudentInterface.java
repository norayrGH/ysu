package com.example.ysu.interfaces.com;

import com.example.ysu.entitys.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentInterface extends CrudRepository<Student,Long > {



}
