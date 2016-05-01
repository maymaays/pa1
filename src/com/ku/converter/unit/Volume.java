package com.ku.converter.unit;

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
		
		
		private Volume(String name, double value) {
			this.name = name;
			this.value = value;
		}
		
		public double getValue() {		
			return this.value;
		}
		
		public String toString() {
			return this.name();
		}
	}

