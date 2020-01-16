package com.pe.car.mechanic.service.engine.types.rest.response;

import com.pe.car.mechanic.service.engine.types.base.ResponseBase;
import com.pe.car.mechanic.service.engine.types.business.PaymentProcessorResponse;

public class RestSampleOneEngineResponse extends ResponseBase {
	
	private String trace;
	private String amount;
	private String date;
	private PaymentProcessorResponse processorResponse;

	public String getTrace() {
		return trace;
	}
	public void setTrace(String trace) {
		this.trace = trace;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public PaymentProcessorResponse getProcessorResponse() {
		return processorResponse;
	}
	public void setProcessorResponse(PaymentProcessorResponse processorResponse) {
		this.processorResponse = processorResponse;
	}
}
