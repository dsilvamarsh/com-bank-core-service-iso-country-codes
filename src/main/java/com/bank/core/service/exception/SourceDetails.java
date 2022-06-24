package com.bank.core.service.exception;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@AllArgsConstructor
@Builder
@Data
public class SourceDetails implements Serializable {
	private static final long serialVersionUID = 1L;

	private String layer;
	private String apiName;
	private String supportEmail;
}
