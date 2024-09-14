package com.example.filter;
import java.util.HashMap;
import java.util.Map;
public class HttpRequest {
	private String url;
    private Map<String, String> headers = new HashMap<>();

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Map<String, String> getHeaders() {
        return headers;
    }

    public void addHeader(String key, String value) {
        headers.put(key, value);
    }

	public String getHeader(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

