package com.ku.converter.unit;

/***
 * Respresents the measurement in any unit
 * @author Methawee Apinainarong 5810546714
 */

public interface Unit {
	
	/**
	 * Getting the current value at specific unit that choosing by user
	 * @return current value
	 */
	
	public double getValue();
	
	/**
	 * Getting the current name of specific unit that choosing by user
	 * @return current name
	 */
	public String toString();
	
}
