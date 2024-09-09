package fmd;

public class GFG {

	public static void main(String[] args) {
			       VehicleFactory twowheelerFactory = new twowheelerFactory();
			       client twowheelerclient = new client(twowheelerFactory);
			       Vehicle twowheeler = twowheelerclient.getVehicle();
			       twowheeler.printvehicle();

			       VehicleFactory fourwheelerFactory = new fourwheelerFactory();
			       client fourwheelerclient = new client(fourwheelerFactory);
			       Vehicle fourwheeler = fourwheelerclient.getVehicle();
			       fourwheeler.printvehicle();
	}

}
