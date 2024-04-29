package com.example.projectone;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesDao {
	
	@Autowired
	private CountriesRepo countriesRepo;

	public List<Countries> getCountriesList() {
		return countriesRepo.findAll();
	}
	
}
