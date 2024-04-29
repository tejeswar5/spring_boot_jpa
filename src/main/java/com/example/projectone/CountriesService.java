package com.example.projectone;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountriesService {
	
	@Autowired
	private CountriesDao countriesDao;

	public List<Countries> getCountriesList() {
		List<Countries> countries = countriesDao.getCountriesList();;
		return countries;
	}

}
