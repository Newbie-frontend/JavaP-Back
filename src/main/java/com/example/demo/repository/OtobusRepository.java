package com.example.demo.repository;

import com.example.demo.bean.Otobus;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface OtobusRepository extends CarRepository {
    List<Otobus> findByMarkaContaining(String marka);
    Optional<Otobus> findAllById(long id);
    List<Otobus> findByModel(int model, Sort sort);
}
