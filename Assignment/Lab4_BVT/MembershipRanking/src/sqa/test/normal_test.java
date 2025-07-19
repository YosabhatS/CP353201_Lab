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
		  "10000,4,550,Silver",
		  "10001,4,550,Silver",
		  "55000,4,550,Gold",
		  "100000,4,550,Gold",
		  "100001,4,550,Gold",
		  "55000,1,550,Silver",
		  "55000,2,550,Silver",
		  "55000,6,550,Gold",
		  "55000,7,550,Gold",
		  "55000,4,100,Silver",
		  "55000,4,101,Silver",
		  "55000,4,999,Gold",
		  "55000,4,1000,Gold"
	})
	void normal_testCalculateMembershipRank(int purchaseTotal, int frequency, int pointCollected, String expectedRank) {
		Ranking obj = new Ranking();
		String result = obj.CalculateMembershipRank(purchaseTotal, frequency, pointCollected);
		assertEquals(expectedRank, result);

	}
	
}
