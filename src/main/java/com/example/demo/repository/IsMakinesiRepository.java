package com.example.demo.repository;

import com.example.demo.bean.IsMakinesi;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface IsMakinesiRepository extends CarRepository{
    List<IsMakinesi> findByMarkaContaining(String marka);
    Optional<IsMakinesi> findAllById(long id);
    List<IsMakinesi> findByModel(int model, Sort sort);
}
