package com.example.tms.route;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RoutePlannerTest {

	 private RoutePlanner planner;
	    private Location start;
	    private Location end;
	    private Vehicle vehicle;

	    @Before
	    public void setUp() {
	        planner = new RoutePlanner();
	        start = new Location(40.7128, -74.0060); // New York
	        end = new Location(34.0522, -118.2437);  
	        vehicle = new Vehicle("Truck1");
	    }

	    @Test
	    public void testFindOptimalRoute() {
	        Route route = planner.findOptimalRoute(start, end, vehicle);
	        assertNotNull(route);
	        assertEquals(100, route.getDistance(),0.011);
	        assertEquals(120, route.getDuration());
	    }
	}
