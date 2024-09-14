package com.example.tms.tracking;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class VehicleTrackerTest {
	private VehicleTracker tracker;

    @Before
    public void setUp() {
        tracker = new VehicleTracker();
    }

    @Test
    public void testGetCurrentLocation() {
        VehicleLocation location = tracker.getCurrentLocation("Truck1");
        assertNotNull(location);
        assertEquals(-74.0060, location.getLongitude(), 0.01);
    }
}
