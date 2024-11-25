package org.example;

abstract class Car implements Vehicle {
	protected final int fuelTankSize;
	protected final String fuelType;
	protected final int gear;
	protected final double consumptionPer100Km;

	double consumptionStats;
	int tireSize;
	int availableFuel;
	String chassisNumber;
	int changedGear = 0;

	public Car(int fuelTankSize,String fuelType, int gear, double consumptionPer100Km) {
		this.fuelTankSize = fuelTankSize;
		this.fuelType = fuelType;
		this.gear = gear;
		this.consumptionPer100Km = consumptionPer100Km;
	}

	public int shiftGear(int newGear) {
		changedGear = newGear;
		System.out.println("You are now in gear " + changedGear);
		return changedGear;
	}

	@Override
	public void start() {
		System.out.println("Your cars has started.");
		consumptionStats = 0.0;
	}
}
