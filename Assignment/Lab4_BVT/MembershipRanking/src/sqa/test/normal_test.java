package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeAll;
import sqa.main.*;

class normal_test {


	@ParameterizedTest
	@CsvSource({
		  "0,15,500,Standard",
		  "1,15,500,Standard",
		  "50000,15,500,Gold",
		  "100000,15,500,Gold",
		  "100001,15,500,Gold",
		  "50000,0,500,Standard",
		  "50000,1,500,Silver",
		  "50000,30,500,Gold",
		  "50000,31,500,Gold",
		  "50000,15,0,Standard",
		  "50000,15,1,Standard",
		  "50000,15,999,Gold",
		  "50000,15,1000,Gold"
	})
	void normal_testCalculateMembershipRank(int purchaseTotal, int frequency, int pointCollected, String expectedRank) {
		Ranking obj = new Ranking();
		String result = obj.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		assertEquals(expectedRank, result);

	}
	
}
