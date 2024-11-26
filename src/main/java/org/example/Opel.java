package org.example;

abstract class Opel extends Car {
	public String model;

	public Opel(int tireSize, double consumptionPer100Km, int gear, String fuelType, int fuelTankSize, double availableFuel, String chassisNumber, String model) {
		super(tireSize, consumptionPer100Km, gear, fuelType, fuelTankSize, availableFuel, chassisNumber);
		this.model = model;
	}

//	@Override
//	public double drive(double distance) {
//		System.out.println("you are now driving in gear: " + changedGear);
//		consumptionStats = 0.01 * (distance * (consumptionPer100Km - 0.03 * consumptionPer100Km * (changedGear - 1)));
//		return consumptionStats;
////		availableFuel = fuelTankSize - consumptionStats;
//	}
//
//	@Override
//	public void stop(){
//		availableFuel = getAvailableFuel();
//		System.out.println("Your car has Stopped now. Available fuel: " + availableFuel + ", fuel consumption: " + consumptionStats);
//	}
}
