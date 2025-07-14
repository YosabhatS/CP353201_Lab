package test;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import project.RomanNumerals;

class TS001 {

	@Test
	void TC01() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(1,Roman.convertRomanNumToInt("I"));
		
	}
	@Test
	void TC02() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(5,Roman.convertRomanNumToInt("V"));
		
	}
	@Test
	void TC03() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(4,Roman.convertRomanNumToInt("IV"));
		
	}
	@Test
	void TC04() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(9,Roman.convertRomanNumToInt("IX"));
		
	}
	@Test
	void TC05() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(6,Roman.convertRomanNumToInt("VI"));
		
	}
	@Test
	void TC06() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(101,Roman.convertRomanNumToInt("CI"));
		
	}
	@Test
	void TC07() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(2,Roman.convertRomanNumToInt("II"));
		
	}
	@Test
	void TC08() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(20,Roman.convertRomanNumToInt("XX"));
		
	}
	@Test
	void TC09() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(3,Roman.convertRomanNumToInt("III"));
		
	}
	@Test
	void TC10() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(30,Roman.convertRomanNumToInt("XXX"));
		
	}
	@Test
	void TC11() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(26,Roman.convertRomanNumToInt("XXVI"));
		
	}
	@Test
	void TC12() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(27,Roman.convertRomanNumToInt("XXVII"));
		
	}
	@Test
	void TC13() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(74,Roman.convertRomanNumToInt("LXXIV"));
		
	}
	@Test
	void TC14() {
		RomanNumerals Roman = new  RomanNumerals();
		assertEquals(76,Roman.convertRomanNumToInt("LXXVI"));
		
	}
	@Test
	void TC15() {
		RomanNumerals Roman = new  RomanNumerals();
		assertThrows(NullPointerException.class,() -> {Roman.convertRomanNumToInt("J");});
		
	}
	@Test
	void TC16() {
		RomanNumerals Roman = new  RomanNumerals();
		assertNotEquals(100,Roman.convertRomanNumToInt("VV"));
		
	}
	@Test
	void TC17() {
		RomanNumerals Roman = new  RomanNumerals();
		assertNotEquals(40,Roman.convertRomanNumToInt("IIII"));
		
	}

}
