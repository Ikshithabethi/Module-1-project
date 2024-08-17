package com.example.filter;

public class HttpResponse {
	 private int statusCode = 200; // Default to 200 OK
	    private String body;

	    public int getStatusCode() {
	        return statusCode;
	    }

	    public void setStatusCode(int statusCode) {
	        this.statusCode = statusCode;
	    }

	    public String getBody() {
	        return body;
	    }

	    public void setBody(String body) {
	        this.body = body;
	    }
	}
