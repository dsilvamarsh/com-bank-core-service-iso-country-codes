package com.bank.core.service.bean;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonIgnoreProperties(ignoreUnknown = true)
@AllArgsConstructor
public class CountryCodes implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String name;
	@Id
	private String code2;
	private String code3;
	private int countryCode;
	private String region;
	private String subRegion;
	private String intermediateRegion;
	private int regionCode;
	private int subRegionCode;
	@Nullable
	private int intermediateRegionCode;
	
	
	
}
