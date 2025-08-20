package sqa.test.top_down;

import sqa.main.CookingConversionCalculator;
import sqa.main.LiquidVolumeConverter;
import sqa.main.MassConverter;
import sqa.main.TemperatureConverter;

public class CookingConversionCalculatorStubs extends CookingConversionCalculator{
	@Override
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		double result = 0.0;
		TemperatureConverterStub tempConverter = new TemperatureConverterStub();
		MassConverterStub massConverter = new MassConverterStub();
		LiquidVolumeConverterStub liquidConverter = new LiquidVolumeConverterStub();
		
		if (choice.equals("temperature")) {
			result = tempConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("mass")) {
			result = massConverter.convert(value, fromUnit, toUnit);
		} else if (choice.equals("liquid")) {
			result = liquidConverter.convert(value, fromUnit, toUnit);
		} 
		
		return result;
		
	}
	public class TemperatureConverterStub extends TemperatureConverter{
		@Override
		public double convert(double tempValue, String fromUnit, String toUnit) {
			return 1;
		}
	}
	public class MassConverterStub extends MassConverter{
		@Override
		public double convert(double tempValue, String fromUnit, String toUnit) {
			return 2;
		}
	}
	public class LiquidVolumeConverterStub extends LiquidVolumeConverter{
		@Override
		public double convert(double tempValue, String fromUnit, String toUnit) {
			return 3;
		}
	}
		

}
