package com.city.demo.controller;

import com.city.demo.model.CityEntity;
import com.city.demo.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/city")
public class CityController {

    @Autowired
    private CityService cityService;

    @PostMapping("/")
    public CityEntity addcity(@RequestBody CityEntity city){
        return cityService.add(city);
    }

    @GetMapping("/{id}")
    public  CityEntity getcity(@PathVariable int id){
     return    cityService.getcity(id);
    }

    @PutMapping("/{id}")
    public  CityEntity updateCity(@RequestBody CityEntity city,@PathVariable int id){
        return  cityService.updatecity(id,city);
    }
    @DeleteMapping("/{id}")
    public  String deletecity(@PathVariable int id){
      return   cityService.deletecity(id);
 }
}
