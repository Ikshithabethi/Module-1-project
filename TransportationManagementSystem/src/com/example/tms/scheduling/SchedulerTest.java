package com.example.tms.scheduling;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Before;
import org.junit.Test;

import com.example.tms.route.Vehicle;

public class SchedulerTest {
	private Scheduler scheduler;

    @Before
    public void setUp() {
        scheduler = new Scheduler();
    }

    @Test
    public void testCreateSchedule() {
        Schedule schedule = scheduler.createSchedule(List.of(new Delivery()), List.of(new Vehicle("Truck1")));
        assertNotNull(schedule);
        // Add more assertions based on your implementation
    }
}