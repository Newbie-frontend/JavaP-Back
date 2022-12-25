package com.example.demo.repository;

import com.example.demo.bean.Kamyon;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface KamyonRepository extends CarRepository{
    List<Kamyon> findByMarkaContaining(String marka);
    Optional<Kamyon> findAllById(long id);
}
