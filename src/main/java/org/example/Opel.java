package org.example;

abstract class Opel extends Car {
	public String model;

	public Opel(int tireSize, double consumptionPer100Km, int gears, String fuelType, int fuelTankSize, double availableFuel, String chassisNumber, String model) {
		super(tireSize, consumptionPer100Km, gears, fuelType, fuelTankSize, availableFuel, chassisNumber);
		this.model = model;
	}

	@Override
	public void drive(double distance) {
        //		Consumption decreases by 6% as the gear increases with 1
		double adjustedConsumptionPer100Km = consumptionPer100Km - 0.06 * consumptionPer100Km * (changedGear - 1);
		double consumptionForDistance = 0.01 * (distance * adjustedConsumptionPer100Km);

		consumptionStats += consumptionForDistance;
		availableFuel -= consumptionForDistance;

		System.out.println("For the latest distance of: " + distance + "Km you have consumed: " + adjustValue(consumptionForDistance, 3) + " liters, available fuel: " + adjustValue(availableFuel, 3) + " liters");
	}
}
