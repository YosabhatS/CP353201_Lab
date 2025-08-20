package sqa.test.top_down;

import sqa.main.LiquidVolumeConverter;

public class LiquidVolumeConverterStubs extends LiquidVolumeConverter{
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		double multiplier = 250;
		return multiplier;
	}

}
