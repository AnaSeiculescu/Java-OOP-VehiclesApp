package org.example;

abstract class Volvo extends Car {
	public String model;

	public Volvo(int tireSize, double consumptionPer100Km, int gear, String fuelType, int fuelTankSize, double availableFuel, String chassisNumber, String model) {
		super(tireSize, consumptionPer100Km, gear, fuelType, fuelTankSize, availableFuel, chassisNumber);
		this.model = model;
	}

	@Override
	public double drive(double distance) {
//		Consumption decreases with 1% as the gear increases with 1
		double adjustedConsumptionPer100Km = consumptionPer100Km - 0.01 * consumptionPer100Km * (changedGear - 1);
		double consumptionForDistance = 0.01 * (distance * adjustedConsumptionPer100Km);
		consumptionStats += consumptionForDistance;
		availableFuel -= consumptionForDistance;

		System.out.println("consumption stats: " + adjustValue(consumptionStats, 3));
		System.out.println("For the latest distance of: " + distance + "Km you have consumed: " + adjustValue(consumptionForDistance, 3) + ", available fuel: " + adjustValue(availableFuel, 3));
//		System.out.println("available fuel: " + adjustValue(availableFuel, 3));
		return consumptionStats;
	}
}
