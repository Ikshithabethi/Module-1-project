package com.example.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
	private List<Filter> filters = new ArrayList<>();
    private int currentIndex = 0;

    public void addFilter(AuthorizationFilter authorizationFilter) {
        filters.add((Filter) authorizationFilter);
    }

    public void doFilter(HttpRequest request, HttpResponse response) {
        if (currentIndex < filters.size()) {
            Filter currentFilter = filters.get(currentIndex++);
            currentFilter.doFilter(request, response, this);
        }
    }

	public void addFilter(AuthenticationFilter authenticationFilter) {
		
		
	}

	public void addFilter(LoggingFilter loggingFilter) {
		
		
	}
}
