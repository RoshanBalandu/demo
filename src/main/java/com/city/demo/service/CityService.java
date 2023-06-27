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

    public CityEntity getCity(int id) {
        return  cityRepository.findById(id).get();
    }

    public String deleteCity(int id) {
          cityRepository.deleteById(id);
        return "entry deleted "+id;
    }

    public CityEntity updateCity(int id,CityEntity city) {
        city.setId(id);
      return   cityRepository.save(city);
    }

    public String deleteAllCity() {
        cityRepository.deleteAll();
        return "All entry deleted ";
    }
}
