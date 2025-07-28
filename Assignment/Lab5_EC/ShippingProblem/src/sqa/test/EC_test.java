package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.ShippingVehicle;

class EC_test {

	@ParameterizedTest
	@CsvSource({
		  "10,0,0,'0,0,10'",
		  "0,10,0,'0,10,0'",
		  "0,0,10,'10,0,0'",
		  "10,10,0,'0,10,10'",
		  "10,0,10,'10,0,10'",
		  "0,10,10,'10,10,0'",
		  "10,10,10,'10,10,10'",
		  "501,0,0,'-1'",
		  "0,201,0,'-1'",
		  "0,0,101,'-1'",
		  "501,201,0,'-1'",
		  "501,0,101,'-1'",
		  "0,201,101,'-1'",
		  "501,201,101,'-1'"
		  
	})
	void test(int smallSize, int mediumSize, int largeSize, String expectedStr) {
		ShippingVehicle obj = new ShippingVehicle();
		List<Integer> result = obj.calculate(smallSize, mediumSize, largeSize);
		List<Integer> expected = Arrays.stream(expectedStr.split(",")).map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
		
		assertEquals(expected, result);
		
	}

}
