package com.pe.car.mechanic.service.engine.types.base;

public class ResponseBase {
	
	public Boolean result;
	public ResponseMessageBase message;
	
	public Boolean getResult() {
		return result;
	}
	public void setResult(Boolean result) {
		this.result = result;
	}
	public ResponseMessageBase getMessage() {
		return message;
	}
	public void setMessage(ResponseMessageBase message) {
		this.message = message;
	}
	
	

}
