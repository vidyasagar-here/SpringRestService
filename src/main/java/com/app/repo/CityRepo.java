package com.app.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.model.City;

public interface CityRepo extends JpaRepository<City, Long> {
	
	List<City> findAll();

}
