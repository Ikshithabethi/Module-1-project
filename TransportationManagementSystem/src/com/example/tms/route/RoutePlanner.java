package com.example.tms.route;

public class RoutePlanner {
	public Route findOptimalRoute(Location start, Location end, Vehicle vehicle) {
       
        Route route = new Route();
        route.setDistance(100); 
        route.setDuration(120); 
        return route;
    }
}
