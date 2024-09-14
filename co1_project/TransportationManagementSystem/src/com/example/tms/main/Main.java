package com.example.tms.main;

import com.example.tms.route.*;
import com.example.tms.tracking.*;
import com.example.tms.scheduling.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // 1. Route Planning
        RoutePlanner planner = new RoutePlanner();
        Location start = new Location(40.7128, -74.0060); // New York
        Location end = new Location(34.0522, -118.2437);  
        Vehicle vehicle = new Vehicle("Truck1");

        Route route = planner.findOptimalRoute(start, end, vehicle);
        System.out.println("Optimal Route Distance: " + route.getDistance() + " km");
        System.out.println("Optimal Route Duration: " + route.getDuration() + " minutes");

        // 2. Vehicle Tracking
        VehicleTracker tracker = new VehicleTracker();
        VehicleLocation location = tracker.getCurrentLocation(vehicle.getId());
        System.out.println("Current Location of Vehicle: (" + location.getLatitude() + ", " + location.getLongitude() + ")");

        // 3. Scheduling
        Scheduler scheduler = new Scheduler();
        Schedule schedule = scheduler.createSchedule(List.of(new Delivery()), List.of(vehicle));
        System.out.println("Schedule created: " + schedule);
    }
}