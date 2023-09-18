package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.Converter;
import main.Converter.SizeInKilo;

class NormalBoundaryValueTesting {

	private Converter conver;
	SizeInKilo size;
	
	@BeforeEach
	@DisplayName("SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	public void setup() {
		// 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec2
	}
	
	
	@Test
	@DisplayName("TC001 : Normal Boundary Value Testing true 1 2")
	public void t_1_2() {
	conver = new Converter(true,1,2);
	size = conver.convert();
	assertEquals("40 kg",size.getSize());
	}
	
	@Test
	@DisplayName("TC002 : Normal Boundary Value Testing true 2 2")
	public void t_2_2() {
	conver = new Converter(true,2,2);
	size = conver.convert();
	assertEquals("32 kg",size.getSize());
	}
	
	@Test
	@DisplayName("TC003 : Normal Boundary Value Testing true 3 2")
	public void t_3_2() {
	conver = new Converter(true,3,2);
	size = conver.convert();
	assertEquals("32 kg",size.getSize());
	}
	
	@Test
	@DisplayName("TC004 : Normal Boundary Value Testing true 2 0")
	public void t_2_0() {
	conver = new Converter(true,2,0);
	size = conver.convert();
	assertEquals("32 kg",size.getSize());
	}
	
	@Test
	@DisplayName("TC005 : Normal Boundary Value Testing true 2 1")
	public void t_2_1() {
	conver = new Converter(true,2,1);
	size = conver.convert();
	assertEquals("40 kg",size.getSize());
	}
	
	@Test
	@DisplayName("TC006 : Normal Boundary Value Testing true 2 3")
	public void t_2_3() {
	conver = new Converter(true,2,3);
	size = conver.convert();
	assertEquals("32 kg",size.getSize());
	}

}
