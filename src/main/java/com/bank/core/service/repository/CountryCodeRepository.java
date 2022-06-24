package com.bank.core.service.repository;

import java.util.Optional;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

import org.springframework.data.repository.CrudRepository;

import com.bank.core.service.bean.CountryCodes;

public interface CountryCodeRepository extends CrudRepository<CountryCodes, String> {

	Optional<CountryCodes> findByCode3(@Min(3) @Max(3) String code);

}
