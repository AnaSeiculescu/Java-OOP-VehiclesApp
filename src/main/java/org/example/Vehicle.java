package org.example;

interface Vehicle {
	void start();

	/**
	 * Drive double.
	 *
	 * This method calculates the consumption during the distance traveled:
	 *   - The average consumption decreases with every increasing gear
	 *   - This property exists for all models, but different percentage with every brand
	 *   - The method does not have to watch the changing of the gears, the calculations are made with the current gear
	 *   (we have to call the gearShift() method first, then again drive() method)
	 *   - The consumptionStats is increased and memorised until next stop
	 *
	 * @param distance - the distance traveled until the next call of the method
	 */
	void drive(double distance);

	void stop();
}
