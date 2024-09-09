package fmd;

 class client {
   private Vehicle pVehicle;
   public client(VehicleFactory factory) {
	   pVehicle=factory.createVehicle();
   }
   public Vehicle getVehicle() {
       return pVehicle;
   }
}

