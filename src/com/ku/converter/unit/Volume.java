package com.ku.converter.unit;
/***
 * Respresents the measurement of volume in standard unit
 * @author Methawee Apinainarong 5810546714
 */

public enum Volume implements Unit {
	
	CUBICMETER("Cubic Meter", 1),
	CUBICKILOMETER("Cubic Kilometer", 1000000000),
	CUBICCENTIMETER("Cubic Centimeter",  0.000001),
	LITER("Liter", 0.001),
	MILLIMETER("Millilitter", 0.000001),
	GALON("Gallon",  0.00378541),
	QUART("Quart",  0.0009463525),
	PINT("Pint",  0.0004731763);
		
		private final String name;
		private final double value;
		
		/***
		 * Initialize with the name and value of unit 
		 * @param name of unit
		 * @param value of unit
		 */
		private Volume(String name, double value) {
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
		 * Getting the name of unit for example, cubic meter, cubic kilometer etc.
		 */
		public String toString() {
			return this.name();
		}
	}

