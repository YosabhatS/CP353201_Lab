package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.Income;

class EC_test {
	
	@ParameterizedTest
	@CsvSource({
		  "3000,550,1750,81500",
		  "3000,550,499,-1",
		  "3000,299,1750,-1",
		  "3000,801,3001,-1",
		  "999,550,1750,-1",
		  "5001,550,499,-1",
		  "999,299,1750,-1",
		  "5001,801,2001,-1"
	})
	void testCalculateIncome(int num_impeller, int num_motor, int num_cover, Double ex) {
		Income obj = new Income();
		Double result = obj.calculateIncome(num_impeller, num_motor, num_cover);
		assertEquals(ex, result);
	}

}
