package sqa.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import sqa.main.TVPlan;
import sqa.main.TVPlan.TVPackage;

class LEDT {

	@ParameterizedTest
	@CsvSource({
		  "false,false,false,STANDARD,150",
		  "true,false,false,STANDARD,250",
		  "false,true,false,STANDARD,250",
		  "true,true,false,STANDARD,350",
		  "false,false,true,STANDARD,100",
		  "true,false,true,STANDARD,200",
		  "false,true,true,STANDARD,200",
		  "true,true,true,STANDARD,300",
		  
		  "false,false,false,PREMIUM,250",
		  "true,false,false,PREMIUM,450",
		  "false,true,false,PREMIUM,450",
		  "true,true,false,PREMIUM,550",
		  "false,false,true,PREMIUM,300",
		  "true,false,true,PREMIUM,400",
		  "false,true,true,PREMIUM,400",
		  "true,true,true,PREMIUM,500",
		  
		  "false,false,false,FAMILY,350",
		  "true,false,false,FAMILY,550",
		  "false,true,false,FAMILY,550",
		  "true,true,false,FAMILY,650",
		  "false,false,true,FAMILY,400",
		  "true,false,true,FAMILY,500",
		  "false,true,true,FAMILY,500",
		  "true,true,true,FAMILY,600"
		  
	})
	void test(boolean offline_watching, boolean live_service, boolean discount, TVPackage selectedPackage, double expected) {
		TVPlan tv = new TVPlan(offline_watching,live_service,discount);
		double result = tv.pricePerMonth(selectedPackage);
		assertEquals(expected, result);
	}

}
