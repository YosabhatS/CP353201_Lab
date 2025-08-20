package sqa.test.bottom_up;

import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

public class CookingConversionCalculatorDriver {
	public double tempConverter() {
		double result = 0.0;
		double value = 77;
		String fromUnit = "fahrenheit";
		String toUnit = "celsius";
		TemperatureConverter tempConverter = new TemperatureConverter();
		result = tempConverter.convert(value, fromUnit, toUnit);
		return result;
	}
	
	public double massConverter() {
		double result = 0.0;
		double value = 2;
		String fromUnit = "cup";
		String toUnit = "gram";
		MassConverter massConverter = new MassConverter();
		result = massConverter.convert(value, fromUnit, toUnit);
		return result;
	}
	
	public double liquidConverter() {
		double result = 0.0;
		double value = 2;
		String fromUnit = "cup";
		String toUnit = "ml";
		LiquidVolumeConverter liquidConverter = new LiquidVolumeConverter();
		result = liquidConverter.convert(value, fromUnit, toUnit);
		return result;
	}


}
