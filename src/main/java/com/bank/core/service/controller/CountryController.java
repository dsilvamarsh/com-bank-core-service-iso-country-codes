package com.bank.core.service.controller;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.bank.core.service.bean.CountryCodes;
import com.bank.core.service.repository.CountryCodeRepository;

import lombok.AllArgsConstructor;

@RestController
@AllArgsConstructor
public class CountryController {

	
	private CountryCodeRepository repo;
	
	@GetMapping("/country/code2/{code}")
	public CountryCodes getCountryCode2(@PathVariable(name = "code") @Min(value = 2) @Max(value = 2) String code) {
		
		return repo.findById(code).get();
	}
	@GetMapping("/country/code3/{code}")
	public CountryCodes getCountryCode3(@PathVariable(name = "code")@Min(value = 3) @Max(value = 3)  String code) {
		
		return repo.findByCode3(code).get();
	}
}
