package fmd;

public class twowheelerFactory implements VehicleFactory{
   public Vehicle createVehicle() {
	   return new twowheeler();
   }
}
