package sqa.test.top_down;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

class Top_down_test {

	@Test
	void CookingConversionCalculator_TemperatureConverter_test() {
		CookingConversionCalculatorStubs CookingConversionCalculator = new CookingConversionCalculatorStubs(); 
		double expectedResutl = 1;
		assertEquals(expectedResutl, CookingConversionCalculator.convert(0, "temperature", "", ""));
	}
	
	@Test
	void CookingConversionCalculator_MassConverter_test() {
		CookingConversionCalculatorStubs CookingConversionCalculator = new CookingConversionCalculatorStubs(); 
		double expectedResutl = 2;
		assertEquals(expectedResutl, CookingConversionCalculator.convert(0, "mass", "", ""));
	}
	
	@Test
	void CookingConversionCalculator_LiquidVolumeConverter_test() {
		CookingConversionCalculatorStubs CookingConversionCalculator = new CookingConversionCalculatorStubs(); 
		double expectedResutl = 3;
		assertEquals(expectedResutl, CookingConversionCalculator.convert(0, "liquid", "", ""));
	}
	
	@Test
	void TemperatureConverter_test() {
		TemperatureConverter TemperatureConverter = new TemperatureConverter(); 
		double expectedResutl = 25;
		assertEquals(expectedResutl, TemperatureConverter.convert(77, "fahrenheit", "celsius"));
	}
	
	@Test
	void MassConverter_convert_test() {
		MassConverterStubs MassConverter = new MassConverterStubs(); 
		double expectedResutl = 250;
		assertEquals(expectedResutl, MassConverter.convert(2, "cup", "gram"));
	}
	
	@Test
	void MassConverter_getConversionFactor_test() {
		MassConverter MassConverter = new MassConverter(); 
		double expectedResutl = 250;
		assertEquals(expectedResutl, MassConverter.convert(2, "cup", "gram"));
	}
	
	@Test
	void LiquidVolumeConverter_convert_test() {
		LiquidVolumeConverterStubs LiquidVolumeConverter = new LiquidVolumeConverterStubs(); 
		double expectedResutl = 500;
		assertEquals(expectedResutl, LiquidVolumeConverter.convert(2, "cup", "ml"));
	}
	
	@Test
	void LiquidVolumeConverter_getConversionFactor_test() {
		LiquidVolumeConverter LiquidVolumeConverter = new LiquidVolumeConverter(); 
		double expectedResutl = 500;
		assertEquals(expectedResutl, LiquidVolumeConverter.convert(2, "cup", "ml"));
	}
	

}
