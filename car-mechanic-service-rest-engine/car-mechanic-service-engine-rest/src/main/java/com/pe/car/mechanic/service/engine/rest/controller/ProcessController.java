package com.pe.car.mechanic.service.engine.rest.controller;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.pe.car.mechanic.service.engine.context.ContextHolder;
import com.pe.car.mechanic.service.engine.context.EngineContext;
import com.pe.car.mechanic.service.engine.messages.ProcessErrorMessagesIds;
import com.pe.car.mechanic.service.engine.service.ProcessService;
import com.pe.car.mechanic.service.engine.types.base.ResponseMessageBase;
import com.pe.car.mechanic.service.engine.types.rest.request.RestSampleOneEngineRequest;
import com.pe.car.mechanic.service.engine.types.rest.response.RestSampleOneEngineResponse;


@RestController
public class ProcessController {
	
	private static final Logger LOGGER = LogManager.getLogger(ProcessController.class);
	
	
	@Autowired 
	private ProcessService processService;
	
	
	@RequestMapping(path = "/process", method = RequestMethod.GET)
	public @ResponseBody ResponseEntity<String> processRead() {
		final String methodName = "processRead";
		ResponseEntity<String> httpResponse = null;
		//HttpHeaders responseHeaders = null;
		LOGGER.entry(methodName);
		try {
			String response = "Nice to meet you";
			
			httpResponse = new ResponseEntity<String>(response, HttpStatus.OK);
		} catch (Exception e) {
			LOGGER.error(ProcessErrorMessagesIds.generalErrorMessage, e);
		}
		LOGGER.exit();
		return httpResponse;
	}
	
	@RequestMapping(path = "/process", method = RequestMethod.POST, consumes="application/json", produces="application/json")
	public @ResponseBody ResponseEntity<RestSampleOneEngineResponse> processOperation(@RequestBody RestSampleOneEngineRequest request) {
		final String methodName = "processOperation";
		LOGGER.entry(methodName);
		RestSampleOneEngineResponse response = new RestSampleOneEngineResponse();
		ResponseEntity<RestSampleOneEngineResponse> httpResponse = null;
		try {
			EngineContext context = ContextHolder.get(EngineContext.class);
			context.setRequest(request);
			context.setResponse(response);
			
			processService.process();
			
			response = context.getResponse();
			
		} catch (Exception e) {
			LOGGER.error(ProcessErrorMessagesIds.generalErrorMessage, e);
			response = buildErrorResponse(); 
		}
		httpResponse = 	new ResponseEntity<RestSampleOneEngineResponse>(response, HttpStatus.OK);
		LOGGER.exit();
		return httpResponse;
	}

	private RestSampleOneEngineResponse buildErrorResponse() {
		RestSampleOneEngineResponse response = new RestSampleOneEngineResponse();
		
		response.setResult(Boolean.FALSE);
		response.setMessage(new ResponseMessageBase());
		response.getMessage().setCode(ProcessErrorMessagesIds.generalError);
		response.getMessage().setMessage(ProcessErrorMessagesIds.generalErrorMessage);
		
		return response;
	}
}