package com.ku.converter.unit;

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
	
	private Area(String name, double value) {
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





