package com.city.demo.service;

import com.city.demo.model.CityEntity;
import com.city.demo.repository.CityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityService {

    @Autowired
    private CityRepository cityRepository;

    public CityEntity add(CityEntity city) {
        return cityRepository.save(city);
    }

    public CityEntity getcity(int id) {
        return  cityRepository.find
    }

    public String deletecity(int id) {
          cityRepository.delete(id);
        return "entry deleted "+id;
    }

    public CityEntity updatecity(int id,CityEntity city) {
        city.setId(id);
      return   cityRepository.save(city);
    }
}
