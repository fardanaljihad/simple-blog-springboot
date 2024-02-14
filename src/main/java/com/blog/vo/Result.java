package com.blog.vo;

public class Result {
	int Result;
	String message;
	
	public Result() {
		
	}

	public Result(int result, String message) {
		this.Result = result;
		this.message = message;
	}

	public int getResult() {
		return Result;
	}

	public void setResult(int result) {
		Result = result;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
