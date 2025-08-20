package sqa.test.top_down;

import sqa.main.MassConverter;

public class MassConverterStubs extends MassConverter{
	@Override
	public double getConversionFactor(String fromUnit, String toUnit) {
		double multiplier = 125;
		return multiplier;
	}

}
