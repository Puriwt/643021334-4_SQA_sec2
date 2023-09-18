package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.NullSource;

import main.Converter;
import main.Converter.SizeInKilo;

class EEDT6_2Test {


	// SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2
	
	private Converter conver;
	SizeInKilo size;

	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Inter Calss 1 Royalty don't care : SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	@ParameterizedTest
	@CsvSource({
		"true,1,1,40 kg",
		"true,1,2,40 kg",
		"true,1,3,40 kg",
		"true,1,0,40 kg"
	})
	public void InterGroupCalssOne(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	
	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Inter Calss 2 Royalty 1,2,3")
	@ParameterizedTest
	@CsvSource({
		"true,2,1,40 kg",
		"true,2,2,40 kg",
		"true,2,3,40 kg"
	})
	public void InterGroupCalssTwo(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	
	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Inter Calss 3 Royalty 1,2 ")
	@ParameterizedTest
	@CsvSource({
		"true,3,1,40 kg",
		"true,3,2,40 kg"
	})
	public void InterGroupCalssTree(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	
	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Domestic Calss 1 Royalty 1,2 ")
	@ParameterizedTest
	@CsvSource({
		"false,1,1,40 kg",
		"false,1,2,40 kg"
	})
	public void DomesticGroupCalssOne(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	
	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Dont Groupping")
	@ParameterizedTest
	@CsvSource({
		"true,2,0,32 kg",
		"true,3,3,32 kg",
		"true,3,0,23 kg",
		"false,1,3,32 kg",
		"false,1,0,23 kg",
		"false,2,1,40 kg",
		"false,2,2,32 kg",
		"false,2,3,23 kg",
		"false,2,0,15 kg",
		"false,3,1,32 kg",
		"false,3,2,23 kg",
		"false,3,3,15 kg",
		"false,3,0,7 kg"
	})
	public void DontGroupping(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	
	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Invalid Input")
	@ParameterizedTest
	@CsvSource({
		"true,-1,1",
		"true,-1,2",
		"true,-1,3",
		"true,-1,0",
		"true,1,-1",
		"true,2,-1",
		"true,3,-1",
		"true,-1,-1",
		"true,4,1",
		"true,4,2",
		"true,4,3",
		"true,4,0",
		"true,1,4",
		"true,2,4",
		"true,3,4",
		"true,4,4",
		"false,-1,1",
		"false,-1,2",
		"false,-1,3",
		"false,-1,0",
		"false,1,-1",
		"false,2,-1",
		"false,3,-1",
		"false,-1,-1",
		"false,4,1",
		"false,4,2",
		"false,4,3",
		"false,4,0",
		"false,1,4",
		"false,2,4",
		"false,3,4",
		"false,4,4",
		
	})
	public void InvalidInput(boolean intflight, int flightclass, int royalty) {
		String result = "Invalid input";
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}

	// --------------------------------------------------------------------------------------------
}
