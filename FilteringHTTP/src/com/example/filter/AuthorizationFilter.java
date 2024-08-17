package com.example.filter;

public class AuthorizationFilter implements Filter {
    @Override
    public void execute(HttpRequest request, HttpResponse response, FilterChain chain) {
        System.out.println("Authorization Filter: Checking authorization...");
        // Simulate authorization check
        String role = request.getHeader("Role");
        if (role == null || !role.equals("ADMIN")) {
            response.setStatusCode(403); // Forbidden
            response.setBody("Forbidden");
            return;
        }
        chain.doFilter(request, response);
    }

	@Override
	public void doFilter(HttpRequest request, HttpResponse response, FilterChain chain) {
		// TODO Auto-generated method stub
		
	}
}
