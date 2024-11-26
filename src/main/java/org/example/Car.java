package org.example;

abstract class Car implements Vehicle {
	protected final int fuelTankSize;
	protected final String fuelType;
	protected final int gear;
	protected final double consumptionPer100Km;

	int tireSize;

	double availableFuel;
	String chassisNumber;

	int changedGear = 0;
	double consumptionStats = 0;

	public Car(int tireSize, double consumptionPer100Km, int gear, String fuelType, int fuelTankSize, double availableFuel, String chassisNumber) {

		this.tireSize = tireSize;
		this.consumptionPer100Km = consumptionPer100Km;
		this.gear = gear;
		this.fuelType = fuelType;
		this.fuelTankSize = fuelTankSize;
		if (availableFuel > fuelTankSize) {
			System.out.println("Alert: Available fuel you entered (" + availableFuel + ") exceeds the fuel tank size (" + fuelTankSize + "). Setting the available fuel to fuel tank size");
			this.availableFuel = fuelTankSize;
		} else {
			this.availableFuel = availableFuel;
		}
		this.chassisNumber = chassisNumber;
	}

	public double getAverageFuelConsumption() {
		System.out.println("average consumption: " + consumptionPer100Km);
		return consumptionPer100Km;
	}

	public double getAvailableFuel() {
		return adjustValue(availableFuel, 3);
	}

	public void shiftGear(int newGear) {
		changedGear = newGear;
		System.out.println("You are now in gear " + changedGear + ", available fuel: " + adjustValue(availableFuel, 3));
//		return changedGear;
	}

	@Override
	public void start() {
		consumptionStats = 0.0;
		System.out.println("Your car has started. Available fuel: " + adjustValue(availableFuel, 3));
	}

	@Override
	public void stop(){
		System.out.println("Your car has Stopped now. Available fuel: " + adjustValue(availableFuel, 3) + ", fuel consumption from last start: " + adjustValue(consumptionStats, 3));
	}

	public double adjustValue(double value, int places) {
		double scale = Math.pow(10, places);
		return Math.round(value * scale) / scale;
	}


}
