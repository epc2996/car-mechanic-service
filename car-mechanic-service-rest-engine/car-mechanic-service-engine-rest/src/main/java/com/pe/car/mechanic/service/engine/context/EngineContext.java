package com.pe.car.mechanic.service.engine.context;

import com.pe.car.mechanic.service.engine.types.rest.request.RestSampleOneEngineRequest;
import com.pe.car.mechanic.service.engine.types.rest.response.RestSampleOneEngineResponse;

public class EngineContext extends Context{
	
	private RestSampleOneEngineRequest request;
	private RestSampleOneEngineResponse response;
	
	public RestSampleOneEngineRequest getRequest() {
		return request;
	}
	public void setRequest(RestSampleOneEngineRequest request) {
		this.request = request;
	}
	public RestSampleOneEngineResponse getResponse() {
		return response;
	}
	public void setResponse(RestSampleOneEngineResponse response) {
		this.response = response;
	}

}
