package com.ku.converter.unit;

public enum Volume implements Unit {
	
	CubicMeter("Cubic Meter", 1),
	CubicKilometer("Cubic Kilometer", 1000000000),
	CubicCentimeter("Cubic Centimeter",  0.000001),
	Liter("Liter", 0.001),
	Milliliter("Millilitter", 0.000001),
	Gallon("Gallon",  0.00378541),
	Quart("Quart",  0.0009463525),
	Pint("Pint",  0.0004731763);
		
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

