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
}
