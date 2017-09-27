package com.example.ysu.interfaces.com;

import com.example.ysu.entitys.Pictuare;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PictuareInterface extends CrudRepository<Pictuare,Long> {
}
