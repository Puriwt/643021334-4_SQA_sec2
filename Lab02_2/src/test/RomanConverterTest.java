package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.IntegerToRomanConverter;

class RomanConverterTest {
	
IntegerToRomanConverter intToRoman;
	
	@BeforeEach
	void setUp() {
		intToRoman = new IntegerToRomanConverter();
	}
	
	// numbers Units
	@Test
	@DisplayName("TS001 : Integer To Roman Converter For Number Units")
	void numberUnitsTest() {
		String result01 = intToRoman.integerToRoman(0);
		assertEquals("", result01);
		String result02 = intToRoman.integerToRoman(1);
		assertEquals("I", result02);
		String result03 = intToRoman.integerToRoman(5);
		assertEquals("V", result03);
		String result04 = intToRoman.integerToRoman(6);
		assertEquals("VI", result04);
		String result05 = intToRoman.integerToRoman(8);
		assertEquals("VIII", result05);
		String result06 = intToRoman.integerToRoman(9);
		assertEquals("IX", result06);
	}
	
	// Number of Tens
	@Test
	@DisplayName("TS002 : Integer To Roman Converter For Number Of Tens")
	void numberOfTens() {
		String result01 = intToRoman.integerToRoman(10);
		assertEquals("X", result01);
		String result02 = intToRoman.integerToRoman(34);
		assertEquals("XXXIV", result02);
		String result03 = intToRoman.integerToRoman(46);
		assertEquals("XLVI", result03);
		String result04 = intToRoman.integerToRoman(55);
		assertEquals("LV", result04);
		String result05 = intToRoman.integerToRoman(88);
		assertEquals("LXXXVIII", result05);
		String result06 = intToRoman.integerToRoman(99);
		assertEquals("XCIX", result06);
	}
	
	// Number of Hundred
	@Test
	@DisplayName("TS003 : Integer To Roman Converter For Number Of Hundred")
	void numberOfHundred() {
		String result01 = intToRoman.integerToRoman(100);
		assertEquals("C", result01);
		String result02 = intToRoman.integerToRoman(119);
		assertEquals("CXIX", result02);
		String result03 = intToRoman.integerToRoman(347);
		assertEquals("CCCXLVII", result03);
		String result04 = intToRoman.integerToRoman(556);
		assertEquals("DLVI", result04);
		String result05 = intToRoman.integerToRoman(898);
		assertEquals("DCCCXCVIII", result05);
		String result06 = intToRoman.integerToRoman(999);
		assertEquals("CMXCIX", result06);
	}
	
	// Number of Thousand
	@Test
	@DisplayName("TS004 : Integer To Roman Converter For Number Of Thousand")
	void numberOfThousand() {
		String result01 = intToRoman.integerToRoman(1000);
		assertEquals("M", result01);
		String result02 = intToRoman.integerToRoman(2811);
		assertEquals("MMDCCCXI", result02);
		String result03 = intToRoman.integerToRoman(3270);
		assertEquals("MMMCCLXX", result03);
		String result04 = intToRoman.integerToRoman(4000);
		assertEquals("", result04);
		String result05 = intToRoman.integerToRoman(5000);
		assertEquals("", result05);
		String result06 = intToRoman.integerToRoman(9999);
		assertEquals("", result06);
	}

}
