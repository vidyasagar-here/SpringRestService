package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.model.City;
import com.app.service.ICityService;

@RestController
public class MyController  implements ErrorController{
	
	@Autowired
	public ICityService cityService;
	
	@GetMapping(value = "/cities")
	public List<City> getCities() {

        List<City> cities = cityService.findAll();

        return cities;
    }

}
