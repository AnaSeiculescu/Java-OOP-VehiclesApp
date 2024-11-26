package org.example;

public class Main {
	public static void main(String[] args) {

//		Car car = new Car(); // this should not compile.
//		Car car = new Opel(27, "oiqe0934hkkadsn"); // this should not compile! If I want to create an Opel car, I will need to create an instance of an Opel model.

		Car car = new Corsa(37, "oiqe0934hkkadsn"); // Corsa extendd from Opel, while Opel extends from Car
		car.start();
		car.shiftGear(1);
		car.drive(0.1); // drives 0.01 KMs
		car.shiftGear(2);
		car.drive(0.5);
		car.shiftGear(3);
		car.drive(5);
		car.shiftGear(4);
		car.drive(50);
		car.shiftGear(4);
		car.drive(30);
		car.shiftGear(5);
		car.drive(10);
		car.shiftGear(4);
		car.drive(10);
		car.shiftGear(3);
		car.drive(5);
		car.stop();
		car.start();

		double availableFuel = car.getAvailableFuel();
		System.out.println("available fuel from main: " + availableFuel);
//		double fuelConsumedPer100Km = car.getAverageFuelConsumption();


		Vehicle vehicle = new Corsa(30, "1987ddkshik289"); // available fuel and chassis number
		vehicle.start();
		vehicle.drive(1);
		vehicle.stop();
		Car car2 = (Car) vehicle;

		double availableFuel2 = car2.getAvailableFuel();
		double fuelConsumedPer100Km = car2.getAverageFuelConsumption();
	}

}
