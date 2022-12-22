package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.bean.Car;
import org.springframework.data.repository.NoRepositoryBean;

@NoRepositoryBean
public interface CarRepository extends JpaRepository<Car, Long> {

}
