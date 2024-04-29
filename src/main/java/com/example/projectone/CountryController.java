package com.example.projectone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/country")
public class CountryController {
	
	@Autowired
	private CountriesService countriesService;

	@GetMapping("/getCountry")
	public List<Countries> countryList() {
		List<Countries> countries = countriesService.getCountriesList();
		return countries;
	}
	
}
