package com.ku.converter;

import com.ku.converter.unit.Unit;

public class UnitConverter {
	
	/***
	 * perform conversions between Distance and Length units (converter function)
	 * @param amount - the value of current unit
	 * @param fromUnit - the current unit
	 * @param toUnit - the unit that user want to change
	 * @return the value that has converted already
	 */
		public double convert(double amount, Unit fromUnit, Unit toUnit) {
		return (amount * fromUnit.getValue()) / toUnit.getValue();
	}


	/***
	 * Perform getting the unit
	 * @return the unit
	 */
		
		public Unit[] getUnits(UnitType utype) {
			return UnitFactory.getInstance().getUnit(utype);
			
		}
		
}
