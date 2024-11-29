package org.example;

abstract class Volvo extends Car {
	public String model;

	public Volvo(int tireSize, double consumptionPer100Km, int gears, String fuelType, int fuelTankSize, double availableFuel, String chassisNumber, String model) {
		super(tireSize, consumptionPer100Km, gears, fuelType, fuelTankSize, availableFuel, chassisNumber);
		this.model = model;
	}

	@Override
	public void drive(double distance) {
		double adjustedConsumptionPer100Km = 0;
		if (tireSize == 15) {
			//		Consumption decreases by 4% as the gear increases with 1
			adjustedConsumptionPer100Km = consumptionPer100Km - 0.04 * consumptionPer100Km * (changedGear - 1);
		} else {
			//		Consumption increases by 2% with every increased tire size
			double consumptionIfLargerTires = 0.02 * (tireSize - 15);
			adjustedConsumptionPer100Km = consumptionPer100Km - 0.04 * consumptionPer100Km * (changedGear - 1) + consumptionIfLargerTires;
		}


		double consumptionForDistance = 0.01 * (distance * adjustedConsumptionPer100Km);

		consumptionStats += consumptionForDistance;
		availableFuel -= consumptionForDistance;

		System.out.println("For the latest distance of: " + distance + "Km you have consumed: " + adjustValue(consumptionForDistance, 3) + " liters, available fuel: " + adjustValue(availableFuel, 3) + " liters");
	}
}
