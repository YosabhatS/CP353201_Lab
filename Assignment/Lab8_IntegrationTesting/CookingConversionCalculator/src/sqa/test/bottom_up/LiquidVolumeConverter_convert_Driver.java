package sqa.test.bottom_up;

import sqa.main.LiquidVolumeConverter;

public class LiquidVolumeConverter_convert_Driver {
	public double convert() {
		LiquidVolumeConverter LiquidVolumeConverter = new LiquidVolumeConverter();
		double result = 0.0;
		double massValue = 2;
		String fromUnit = "cup";
		String toUnit = "ml";
		result = massValue * LiquidVolumeConverter.getConversionFactor(fromUnit, toUnit);
		return result;
	
	}

}
