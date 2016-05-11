package com.ku.converter.controller;
/**
 * Respresents the controller of the unit converter programme
 * @author Methawee Apinainarong 5810546714
 */
import com.ku.converter.UnitConverter;
import com.ku.converter.ui.ConverterUI;

public class ControllerConverter {
	
	public static void main(String[] args) {
		
		UnitConverter unit = new UnitConverter();
		ConverterUI convert = new ConverterUI(unit);
		convert.run();
	}
}
