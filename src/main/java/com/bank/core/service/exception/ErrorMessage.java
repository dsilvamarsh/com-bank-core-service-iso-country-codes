package com.bank.core.service.exception;

import java.io.Serializable;
import java.util.List;

import org.apache.logging.log4j.util.Strings;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class ErrorMessage implements Serializable{

	private static final long serialVersionUID = 1L;
	private List<Strings> errors;
	private SourceDetails sourceDetails;
	
	
	
}
