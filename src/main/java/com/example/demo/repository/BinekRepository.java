package com.example.demo.repository;

import com.example.demo.bean.Binek;
import org.springframework.stereotype.Repository;
import java.util.List;
import java.util.Optional;

@Repository
public interface BinekRepository extends CarRepository {
    List<Binek> findByMarkaContaining(String marka);
    Optional<Binek> findAllById(long id);
}
