package com.pe.car.mechanic.service.engine.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.pe.car.mechanic.service.engine.service.ValidationService;

@Service
public class ValidationServiceImpl implements ValidationService{
	
	private static final Logger LOGGER = LogManager.getLogger(ValidationServiceImpl.class);
	
	@Override
	public void validateAuthorizeParams() {
		final String methodName = "validateAuthorizeParams";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}

	@Override
	public void validateConsultParams() {
		final String methodName = "validateConsultParams";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}

	@Override
	public void validateReverseParams() {
		final String methodName = "validateReverseParams";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}

	@Override
	public void baseValidation() {
		final String methodName = "authorize";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}

}
