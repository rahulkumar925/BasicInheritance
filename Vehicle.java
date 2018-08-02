//create a class "Vehicle", define a method "public void start()" in it. 
//From this class derive a class FourWheeler. Override "start()" method of parent class and test it.
public class Vehicle {

	void start() {
		System.out.println("Vehice Class");
	}
}

class FourWheeler extends Vehicle {

	void start() {
		System.out.println("Four-Wheeler Class");
	}
}

class TestVehicle {

	public static void main(String args[]) {

		// FourWheeler fourwheeler = new FourWheeler(); //It will also print
		// start method of child class.
		Vehicle fourwheeler = new FourWheeler();
		fourwheeler.start();
	}
}
