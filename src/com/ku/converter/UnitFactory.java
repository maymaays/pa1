package com.ku.converter;

import com.ku.converter.unit.Area;
import com.ku.converter.unit.Length;
import com.ku.converter.unit.Unit;
import com.ku.converter.unit.Volume;
import com.ku.converter.unit.Weight;

public class UnitFactory {

	private static UnitFactory instance = null;

	private UnitFactory() {
	}

	public static UnitFactory getInstance() {

		if (instance == null) {
			instance = new UnitFactory();
		}
		return instance;
	}

	public UnitType[] getUnitTypes() {
		return UnitType.values();
	}

	public Unit[] getUnit(UnitType utype) {

		if (utype == UnitType.LENGTH) {
			return Length.values();
		} else if (utype == UnitType.AREA) {
			return Area.values();
		} else if (utype == UnitType.WEIGHT) {
			return Weight.values();
		} else 
			return Volume.values();	
	}
}
