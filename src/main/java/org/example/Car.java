package org.example;

abstract class Car implements Vehicle {
	protected final int fuelTankSize;
	protected final int gear;
	protected final float consumptionPer100Km;

	public Car(int fuelTankSize, int gear, float consumptionPer100Km) {
		this.fuelTankSize = fuelTankSize;
		this.gear = gear;
		this.consumptionPer100Km = consumptionPer100Km;
	}

	public abstract String fuelType();
}
