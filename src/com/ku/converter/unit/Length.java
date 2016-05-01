package com.ku.converter.unit;
/***
 * Respresents the measurement of length in standard unit
 * @author Methawee Apinainarong 5810546714
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
	 * Initialize with the name and value of unit 
	 * @param name of unit
	 * @param value of unit
	 */
	private Length(String name, double value) {
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
	 * Getting the name of unit for example, meter, centimeter etc.
	 */
	public String toString() {
		return this.name();
	}
}
