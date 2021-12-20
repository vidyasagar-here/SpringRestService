package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.model.City;
import com.app.repo.CityRepo;

@Service
public class CityService implements ICityService{
	
	@Autowired
	CityRepo cityrepo;

	@Override
	public List<City> findAll() {
		return cityrepo.findAll();
	}

}
