package com.example.tms.tracking;

public class VehicleLocation {
    private double latitude;
    private double longitude;

    public VehicleLocation(double latitude, double longitude) {
        this.latitude = latitude;
        this.longitude = longitude;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
