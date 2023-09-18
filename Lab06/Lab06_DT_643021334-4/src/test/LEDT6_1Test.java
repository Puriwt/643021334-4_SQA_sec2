package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import main.Converter;
import main.Converter.SizeInKilo;

class LEDT6_1Test {


	// SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2
	
	private Converter conver;
	SizeInKilo size;

	@DisplayName("Flight Don't Care : SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	@ParameterizedTest
	@CsvSource({
		"true,1,1,40 kg",
		"true,2,1,40 kg",
		"true,1,2,40 kg",
		"flase,1,1,40 kg",
		"false,2,1,40 kg",
		"false,1,2,40 kg"
	})
	public void FlightDontCare(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}
	
	// --------------------------------------------------------------------------------------------
	
	@DisplayName("Don't Groupping")
	@ParameterizedTest
	@CsvSource({
		"true,3,1,40 kg",
		"true,2,2,40 kg",
		"true,3,2,40 kg",
		"true,1,3,40 kg",
		"true,2,3,40 kg",
		"true,3,3,32 kg",
		"true,1,0,40 kg",
		"true,2,0,32 kg",
		"true,3,0,23 kg",
		"false,3,1,32 kg",
		"false,2,2,32 kg",
		"false,3,2,23 kg",
		"false,1,3,32 kg",
		"false,2,3,23 kg",
		"false,3,3,15 kg",
		"false,1,0,23 kg",
		"false,2,0,15 kg",
		"false,3,0,7 kg"
	})
	public void DontGroupping(boolean intflight, int flightclass, int royalty,String result) {
		conver = new Converter(intflight,flightclass,royalty);
		size = conver.convert();
		assertEquals(result,size.getSize());
	}

}
