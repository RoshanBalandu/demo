package com.city.demo.repository;

import com.city.demo.model.CityEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CityRepository extends JpaRepository<CityEntity,Integer>  {
    List<CityEntity> findByname(String name);
}
