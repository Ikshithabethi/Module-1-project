package com.example.filter;

public class AuthenticationFilter implements Filter {
    @Override
    public void execute(HttpRequest request, HttpResponse response, FilterChain chain) {
        System.out.println("Authentication Filter: Checking authentication...");
        // Simulate authentication check
        if (request.getHeader("Authorization") == null) {
            response.setStatusCode(401); // Unauthorized
            response.setBody("Unauthorized");
            return;
        }
        chain.doFilter(request, response);
    }

	@Override
	public void doFilter(HttpRequest request, HttpResponse response, FilterChain chain) {
		// TODO Auto-generated method stub
		
	}
}
