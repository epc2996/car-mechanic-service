package com.pe.car.mechanic.service.engine;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

//import org.apache.logging.log4j.LogManager;
//import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockHttpServletRequestBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;

import com.google.gson.Gson;
import com.pe.car.mechanic.service.engine.types.rest.request.RestSampleOneEngineRequest;

public class ProcessControllerAuthorizeTest extends CommonTest {
	
	//private static final Logger LOGGER = LogManager.getLogger(ProcessControllerAuthorizeTest.class);
	
	//private static final String ENDPOINT="http://localhost:8080/rest-samples-one-engine-rest";
	
	@Test
	public void testProcessAuthorizeOk() {
		final String methodName = "testProcessAuthorizeOk"; 
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	
	
	public MvcResult executeCall(RestSampleOneEngineRequest request) throws Exception {
		MockHttpServletRequestBuilder requestBuilder = MockMvcRequestBuilders.post("/process")
				.contentType(MediaType.APPLICATION_JSON)
				.content(new Gson().toJson(request));
		
		MvcResult result = mockMvc
				.perform(requestBuilder)
				.andExpect(status().isOk())
				.andReturn();
		return result;
	}

}
