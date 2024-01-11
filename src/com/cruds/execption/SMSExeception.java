package com.cruds.execption;

public class SMSExeception extends RuntimeException {
	
	private String info;
	
	public SMSExeception(String info) {
		super();
		this.info = info;
	}
	
	public String getInfo() {
		return info;
	}

}
