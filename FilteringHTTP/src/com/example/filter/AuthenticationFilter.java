package com.example.filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(HttpRequest request, HttpResponse response, FilterChain chain) {
        System.out.println("Checking authentication...");
        if (request.getHeader("Authorization") == null) {
            response.setStatusCode(401);
            response.setBody("Unauthorized");
            return;
        }
        chain.doFilter(request, response);
    }

	@Override
	public void doFilter(HttpRequest request, HttpResponse response, FilterChain chain) {
	}
}
