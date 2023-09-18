package test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.ShippingVehicle;

class shippingTestCase {
	
	private ShippingVehicle shipping;

	@BeforeEach
	@DisplayName("SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	public void setup() {
		// 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec2
	}
	@Test
	@DisplayName("TC001 : testing Valid 12 14 20")
	public void testingValid12_14_20() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(4);
        list.add(1);
        list.add(1);
		assertEquals(list,shipping.calculate(12, 14, 20));
	}
	//--------------------------------------------------------------------
	@Test
	@DisplayName("TC002 : testing Valid 0 10 9")
	public void testingValid0_10_9() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(1);
        list.add(4);
		assertEquals(list,shipping.calculate(0, 10, 9));
	}
	//--------------------------------------------------------------------
	@Test
	@DisplayName("TC003 : testing Valid 6 0 20")
	public void testingValid6_0_20() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(1);
        list.add(1);
		assertEquals(list,shipping.calculate(6, 0, 20));
	}
	//--------------------------------------------------------------------
	@Test
	@DisplayName("TC004 : testing Valid 19 1 0")
	public void testingValid19_1_0() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(2);
        list.add(0);
        list.add(0);
		assertEquals(list,shipping.calculate(19, 1, 0));
	}
	//--------------------------------------------------------------------
	@Test
	@DisplayName("TC005 : testing Invalid -5 4 8")
	public void testingInvalid_5_4_8() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
		assertEquals(list,shipping.calculate(-5, 4, 8));
	}
	//--------------------------------------------------------------------
	@Test
	@DisplayName("TC006 : testing Invalid 10 -10 11")
	public void testingInvalid10__10_11() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
		assertEquals(list,shipping.calculate(10, -10, 11));
	}
	//--------------------------------------------------------------------
	@Test
	@DisplayName("TC007 :  testing Invalid 30 15 -4")
	public void testingInvalid30_15__4() {
		shipping = new ShippingVehicle();
		
		ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(-1);
		assertEquals(list,shipping.calculate(30, 15, -4));
	}
	//--------------------------------------------------------------------
	
}
