package org.example;

abstract class Car implements Vehicle {
	protected final int fuelTankSize;
	protected final String fuelType;
	protected final int gears;
	protected final double consumptionPer100Km;

	protected int tireSize;

	protected double availableFuel;
	protected final String chassisNumber;

	protected int changedGear = 0;
	protected double consumptionStats = 0;

	public Car(int tireSize, double consumptionPer100Km, int gears, String fuelType, int fuelTankSize, double availableFuel, String chassisNumber) {

		this.tireSize = tireSize;
		this.consumptionPer100Km = consumptionPer100Km;
		this.gears = gears;
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

	/**
	 * Shift gear.
	 *
	 * It first checks if the demanded gear is an available one.
	 * @param newGear the new gear
	 */
	public void shiftGear(int newGear) {
		if (newGear < 1) {
			System.out.println("You changed in an invalid gear (" + newGear + "). The car will continue with the closest gear available.");
			changedGear = 1;
			System.out.println("You are now in gear " + changedGear + ", available fuel: " + adjustValue(availableFuel, 3) + " liters");
			return;
		} else if (newGear > gears) {
			System.out.println("You changed in an invalid gear (" + newGear + "). The car will continue with the closest gear available.");
			changedGear = gears;
			System.out.println("You are now in gear " + changedGear + ", available fuel: " + adjustValue(availableFuel, 3) + " liters");
			return;
		}
		changedGear = newGear;
		System.out.println("You are now in gear " + changedGear + ", available fuel: " + adjustValue(availableFuel, 3) + " liters");
//		return changedGear;
	}

	@Override
	public void start() {
		consumptionStats = 0.0;
		System.out.println("Your car has started. Available fuel: " + adjustValue(availableFuel, 3) + " liters");
	}

	@Override
	public void stop() {
		System.out.println("Your car has Stopped now. Available fuel: " + adjustValue(availableFuel, 3) + " liters, fuel consumption from last start: " + adjustValue(consumptionStats, 3) + " liters\n");
	}

	/**
	 * Adjust value double.
	 *
	 * This method helps round a number with many digits and obtain a smaller number of digits
	 * @param value - is the value that you want to adjust
	 * @param places - represents the number of digits you want to have after the decimal point
	 * @return the double adjusted number
	 */
	public double adjustValue(double value, int places) {
		double scale = Math.pow(10, places);
		return Math.round(value * scale) / scale;
	}
}
