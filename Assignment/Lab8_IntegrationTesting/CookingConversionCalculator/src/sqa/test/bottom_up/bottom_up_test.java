package sqa.test.bottom_up;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.CookingConversionCalculator;

class bottom_up_test {

	@Test
	void TemperatureConverter_test() {
		CookingConversionCalculatorDriver Driver = new CookingConversionCalculatorDriver();
		double expectedResutl = 25;
		assertEquals(expectedResutl, Driver.tempConverter());
	}
	
	@Test
	void MassConverter_getConversionFactor_test() {
		MassConvert_convert_Driver Driver = new MassConvert_convert_Driver();
		double expectedResutl = 250;
		assertEquals(expectedResutl, Driver.convert());
	}
	
	@Test
	void MassConverter_convert_test() {
		CookingConversionCalculatorDriver Driver = new CookingConversionCalculatorDriver();
		double expectedResutl = 250;
		assertEquals(expectedResutl, Driver.massConverter());
	}
	
	@Test
	void LiquidVolumeConverter_getConversionFactor_test() {
		LiquidVolumeConverter_convert_Driver Driver = new LiquidVolumeConverter_convert_Driver();
		double expectedResutl = 500;
		assertEquals(expectedResutl, Driver.convert());
	}
	
	@Test
	void  LiquidVolumeConverter_convert_test() {
		CookingConversionCalculatorDriver Driver = new CookingConversionCalculatorDriver();
		double expectedResutl = 500;
		assertEquals(expectedResutl, Driver.liquidConverter());
	}
	
	@Test
	void  CookingConversionCalculator_test() {
		CookingConversionCalculator CookingConversionCalculator = new CookingConversionCalculator();
		double expectedResutl = 40;
		double value = 5;
		String choice = "mass";
		String fromUnit = "tablespoon";
		String toUnit = "gram";
		assertEquals(expectedResutl, CookingConversionCalculator.convert(value, choice, fromUnit, toUnit));
	}

}
