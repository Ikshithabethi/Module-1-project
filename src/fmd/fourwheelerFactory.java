package fmd;

public class fourwheelerFactory implements VehicleFactory{
	public Vehicle createVehicle() {
		return new fourwheeler();
	}
}