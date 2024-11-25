package org.example;

abstract class Volvo extends Car {
	public String model;

	public Volvo(int fuelTankSize, String fuelType, int gear, double consumptionPer100Km, String model) {
		super(fuelTankSize, fuelType, gear, consumptionPer100Km);
		this.model = model;
	}

	@Override
	public void drive(double distance) {
		consumptionStats = 0.01 * (distance * (consumptionPer100Km));
	}
}
