package com.ku.converter.unit;
/***
 * Respresents the measurement of area in standard unit
 * @author Methawee Apinainarong 5810546714
 */

public enum Area implements Unit {
	
	SQUAREMETER("Square Meter", 1.00),
	SQUAREKILOMETER("Square Kilometer", 1000000),
	SQUARECENTIMETER("Square Centimeter", 0.0001),
	HECTARE("Hectare", 10000),
	SQUAREMILE("Square Mile", 2589990),
	SQUAREYARD("Square Yard", 0.83612736),
	SQUAREFOOT("Square Foot", 0.09290304),
	SQUAREINCH("Square Inch", 0.00064516);
	
	private final String name;
	private final double value;
	
	/***
	 * Initialize with the name and value of unit 
	 * @param name of unit
	 * @param value of unit
	 */
	private Area(String name, double value) {
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
	 * Getting the name of unit for example, square meter, square kilometer etc.
	 */
	public String toString() {
		return this.name();
	}
}





