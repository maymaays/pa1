package com.ku.converter.unit;
/***
 * Respresents the measurement or extent of something (distance)
 * from end to end in standard unit
 * @author methawee
 */
public enum Length implements Unit {
	
	METER("Meter", 1.00),
	KILOMETER("Kilometer", 1000),
	CENTIMETER("Centimeter", 0.01),
	NANOMETER("Nanometer", 1.E-9),
	MILE("Mile", 1609.344),
	YARD("Yard", 0.9144),
	FOOT("Foot", 0.3048),
	INCH("Inch", 0.0254);
	
	private final String name;
	private final double value;
	
	/***
	 * Perform the unit with value of the unit that you need
	 * @param name of unit
	 * @param value of unit
	 */
	private Length(String name, double value) {
		this.name = name;
		this.value = value;
	}
	/***
	 * Perform getting the value of unit
	 * @return value of unit
	 */
	public double getValue() {		
		return this.value;
	}
	/***
	 * Perform getting the name of unit for example, meter, centimeter etc.
	 */
	public String toString() {
		return this.name();
	}
}
