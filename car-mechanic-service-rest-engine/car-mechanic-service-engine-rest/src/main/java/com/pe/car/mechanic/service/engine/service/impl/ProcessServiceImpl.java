package com.pe.car.mechanic.service.engine.service.impl;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import com.pe.car.mechanic.service.engine.context.ContextHolder;
import com.pe.car.mechanic.service.engine.context.EngineContext;
import com.pe.car.mechanic.service.engine.messages.ProcessMessagesIds;
import com.pe.car.mechanic.service.engine.service.ProcessService;
import com.pe.car.mechanic.service.engine.types.base.ResponseMessageBase;
import com.pe.car.mechanic.service.engine.types.rest.response.RestSampleOneEngineResponse;

@Service
public class ProcessServiceImpl implements ProcessService {

	private static final Logger LOGGER = LogManager.getLogger(ProcessServiceImpl.class);

	@Override
	public void process() {
		final String methodName = "process";
		LOGGER.entry(methodName);
		LOGGER.trace("Retrieving data from context...");
		EngineContext context = ContextHolder.get(EngineContext.class);
		RestSampleOneEngineResponse response= context.getResponse();
		
				
		response.setResult(Boolean.TRUE);
		response.setMessage(new ResponseMessageBase());
		response.getMessage().setCode(ProcessMessagesIds.success);
		response.getMessage().setMessage(ProcessMessagesIds.successMessage);
		
		
		LOGGER.exit(methodName);
	}
	
	
	

}
