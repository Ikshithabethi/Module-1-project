package com.example.filter;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FilterChainTest {

	private FilterChain filterChain;
    private HttpRequest request;
    private HttpResponse response;

    @Before
    public void setUp() {
        filterChain = new FilterChain();
        request = new HttpRequest();
        response = new HttpResponse();
    }

    @Test
    public void testAuthenticationFilterPasses() {
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthorizationFilter());
        filterChain.addFilter(new LoggingFilter());

        request.setUrl("/example");
        request.addHeader("Authorization", "Bearer token");
        request.addHeader("Role", "ADMIN");

        filterChain.doFilter(request, response);

        assertEquals(200, response.getStatusCode());
        assertEquals("Success", response.getBody());
    }

    @Test
    public void testAuthenticationFilterFails() {
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthorizationFilter());
        filterChain.addFilter(new LoggingFilter());

        request.setUrl("/example");
        // Missing Authorization header

        filterChain.doFilter(request, response);

        assertEquals(401, response.getStatusCode());
        assertEquals("Unauthorized", response.getBody());
    }

    @Test
    public void testAuthorizationFilterFails() {
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthorizationFilter());
        filterChain.addFilter(new LoggingFilter());

        request.setUrl("/example");
        request.addHeader("Authorization", "Bearer token");
        request.addHeader("Role", "USER"); // Role not allowed

        filterChain.doFilter(request, response);

        assertEquals(403, response.getStatusCode());
        assertEquals("Forbidden", response.getBody());
    }
}