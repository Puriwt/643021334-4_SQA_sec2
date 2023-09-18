package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.ButterConverter;
import main.FlourConverter;
import main.LiquidConverter;
import stubAndDriver.StubButter;
import stubAndDriver.StubFlour;
import stubAndDriver.StubLiquid;
import main.IngredientConverter;


class Bottom_UpTest {

	@DisplayName("StubLiquid data transmission Test : SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	@Test
	void StubLiquidTransmissionTest() {
		StubLiquid stub = new StubLiquid();
		// stub จะส่งค่า Multiplier กลับไป 240 เอาไปคูณกับค่าที่เราส่งไปคือ 5 cup : 5 x 240 = 1200 ml
		double expectedResult = 1200.0;
		assertEquals(expectedResult,stub.convert(5.0, "cup", "ml"));
	}
	
	@DisplayName("StubFlour data transmission Test")
	@Test
	void StubFlourTransmissionTest() {
		StubFlour stub = new StubFlour();
		// stub จะส่งค่า Multiplier กลับไป 10 เอาไปคูณกับค่าที่เราส่งไปคือ 7 tablespoon : 7 x 10 = 70 gram
		double expectedResult = 70.0;
		assertEquals(expectedResult,stub.convert(7.0, "tablespoon", "gram"));
	}
	
	@DisplayName("StubButter data transmission Test")
	@Test
	void StubButterTransmissionTest() {
		StubButter stub = new StubButter();
		// stub จะส่งค่า Multiplier กลับไป 227 เอาไปคูณกับค่าที่เราส่งไปคือ 3 tablespoon : 3 x 227 = 681 gram
		double expectedResult = 681.0;
		assertEquals(expectedResult,stub.convert(3.0, "cup", "gram"));
	}
	
	// ------------------------------------------------------------------------------------------------------
	
	@DisplayName("Liquid data transmission Test")
	@Test
	void LiquidTransmissionTest() {
		LiquidConverter liquid = new LiquidConverter();
		//  เอาไปคูณกับค่าที่เราส่งไปคือ 5 cup : 5 x 240 = 1200 ml
		double expectedResult = 1200.0;
		assertEquals(expectedResult,liquid.convert(5.0, "cup", "ml"));
	}
	
	@DisplayName("Flour data transmission Test")
	@Test
	void FlourTransmissionTest() {
		FlourConverter flour = new FlourConverter();
		//  เอาไปคูณกับค่าที่เราส่งไปคือ 7 tablespoon : 7 x 10 = 70 gram
		double expectedResult = 70.0;
		assertEquals(expectedResult,flour.convert(7.0, "tablespoon", "gram"));
	}
	
	@DisplayName("Butter data transmission Test")
	@Test
	void ButterTransmissionTest() {
		ButterConverter butter = new ButterConverter();
		//  เอาไปคูณกับค่าที่เราส่งไปคือ 3 tablespoon : 3 x 227 = 681 gram
		double expectedResult = 681.0;
		assertEquals(expectedResult,butter.convert(3.0, "cup", "gram"));
	}
	
	// ------------------------------------------------------------------------------------------------------
	
	@DisplayName("IngredientConverter Liquid Test")
	@Test
	void IngredientConverterLiquid() {
		IngredientConverter conver = new IngredientConverter();
		double expectedResult = 1200.0;
		assertEquals(expectedResult,conver.convert(5.0, "liquid", "cup", "ml"));
	}
	
	@DisplayName("IngredientConverter Flour Test")
	@Test
	void IngredientConverterFlour() {
		IngredientConverter conver = new IngredientConverter();
		double expectedResult = 70.0;
		assertEquals(expectedResult,conver.convert(7.0, "flour", "tablespoon", "garm"));
	}
	
	@DisplayName("IngredientConverter Butter Test")
	@Test
	void IngredientConverterButter() {
		IngredientConverter conver = new IngredientConverter();
		double expectedResult = 681.0;
		assertEquals(expectedResult,conver.convert(3.0, "butter", "cup", "garm"));
	}
	
	

}
