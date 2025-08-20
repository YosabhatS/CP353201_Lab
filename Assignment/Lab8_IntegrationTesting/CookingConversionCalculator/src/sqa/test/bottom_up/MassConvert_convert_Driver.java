package sqa.test.bottom_up;
import sqa.main.MassConverter;

public class MassConvert_convert_Driver {
	public double convert() {
		MassConverter MassConverter = new MassConverter();
		double result = 0.0;
		double massValue = 2;
		String fromUnit = "cup";
		String toUnit = "gram";
		result = massValue * MassConverter.getConversionFactor(fromUnit, toUnit);
		return result;
	
	}
	

}
