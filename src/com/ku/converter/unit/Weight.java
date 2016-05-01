package com.ku.converter.unit;
/***
 * Respresents the measurement of weight in standard unit
 * @author Methawee Apinainarong 5810546714
 */

public enum Weight implements Unit {
	
	KILOGRAM("Kilogram", 1),
	GRAM("Gram", 0.001),
	MILLIGRAM("Milligram", 0.000001),
	METRICTON("Metric Ton", 1000),
	POUND("Pound", 0.453592),
	OUNCE("Ounce", 0.0283495),
	CARRAT("Carrat", 0.0002);
	
	private final String name;
	private final double value;
	
	/***
	 * Initialize with the name and value of unit 
	 * @param name of unit
	 * @param value of unit
	 */
	private Weight(String name, double value) {
		this.name = name;
		this.value = value;
	}
	
	/***
	 * Getting the value of current unit
	 * @return value of unit
	 */
	public double getValue() {		
		return this.value;
	}
	/***
	 * Getting the name of unit for example, gram, kilogram etc.
	 */
	public String toString() {
		return this.name();
	}
}
