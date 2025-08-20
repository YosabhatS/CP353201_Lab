package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.CountWordClumps;

class Test {

	@ParameterizedTest
	@CsvSource(
		value = {
		  "null, 0",
		  "' ', 0",
		  "'1,2,3,4', 0",
		  "'1,1,2,3', 1",
		  "'1,1,2,2,3', 2",
		  "'1,1,1,1', 1",
		  "'1,1,2,2,1,1', 3",


	}, nullValues = {"null"})

	void test(String arrayStr, int expected) {
		CountWordClumps obj = new CountWordClumps();
		int[] input;
        if (arrayStr == null || arrayStr.trim().isEmpty()) {
            input = new int[0];
            
        } else {
            input = Arrays.stream(arrayStr.split(",")).map(String::trim).mapToInt(Integer::parseInt).toArray();
            
        }
		int result = obj.countClumps(input);
		assertEquals(expected, result);
	}

}
