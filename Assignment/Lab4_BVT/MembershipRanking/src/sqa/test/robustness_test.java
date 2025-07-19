package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.BeforeAll;
import sqa.main.*;

class robustness_test {
	@ParameterizedTest
	@CsvSource({
		  "-1,4,550,invalid",
		  "0,4,550,Standard",
		  "1,4,550,Standard",
		  "50000,4,550,Gold",
		  "100000,4,550,Gold",
		  "100001,4,550,Gold",
		  "100002,4,550,Gold",
		  "50000,0,550,invalid",
		  "50000,1,550,Standard",
		  "50000,2,550,Silver",
		  "50000,6,550,Gold",
		  "50000,7,550,Gold",
		  "50000,8,550,Gold",
		  "50000,4,99,invalid",
		  "50000,4,100,Standard",
		  "50000,4,101,Standard",
		  "50000,4,999,Gold",
		  "50000,4,1000,Gold",
		  "50000,4,1001,Gold"
		  
	})
	void robustness_testCalculateMembershipRank(int purchaseTotal, int frequency, int pointCollected, String expectedRank) {
		Ranking obj = new Ranking();
		String result = obj.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		assertEquals(expectedRank, result);

	}
	
}
