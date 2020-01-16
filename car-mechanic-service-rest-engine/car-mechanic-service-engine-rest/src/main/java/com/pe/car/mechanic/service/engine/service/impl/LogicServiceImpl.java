package com.pe.car.mechanic.service.engine.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.pe.car.mechanic.service.engine.service.LogicService;

@Service
public class LogicServiceImpl implements LogicService{

	private static final Logger LOGGER = LogManager.getLogger(LogicServiceImpl.class);
	
	@Override
	public void authorize() {
		final String methodName = "authorize";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}

	@Override
	public void consult() {
		final String methodName = "consult";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}

	@Override
	public void reverse() {
		final String methodName = "reverse";
		LOGGER.entry(methodName);
		
		LOGGER.exit(methodName);
	}
}
