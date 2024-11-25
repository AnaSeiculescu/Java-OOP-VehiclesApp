package org.example;

abstract class Opel extends Car {
	public String model;

	public Opel(int fuelTankSize, String fuelType, int gear, double consumptionPer100Km, String model) {
		super(fuelTankSize, fuelType, gear, consumptionPer100Km);
		this.model = model;
	}

	@Override
	public void drive(double distance) {
		consumptionStats = 0.01 * (distance * (consumptionPer100Km - 0.03 * consumptionPer100Km * (changedGear - 1)));
	}
}
