package com.ku.converter.unit;

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
	
	private Weight(String name, double value) {
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
