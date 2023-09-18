package test;


import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

import main.Converter;
import main.Converter.SizeInKilo;

class Worst_CaseBoundaryValueTesting {

	private Converter conver;
	SizeInKilo size;
	
	@BeforeEach
	@DisplayName("SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	public void setup() {
		// 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec2
		
	}
	
	
	@ParameterizedTest
	@DisplayName("UC001 : Worst Case Boundary Value Testing")
	@CsvFileSource(files ="src/test/resources/SID.csv", numLinesToSkip = 1)
	void testTC01(boolean intflight,int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	

}
