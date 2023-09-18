package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import main.CountClump;

class BCTest {
	
	CountClump count = new CountClump();
	int[] number;

	@DisplayName("White Box testing : SID 643021334-4 นายภูริวัฒน์ ศรีปราชญ์ sec 2")
	@Test
	void WhiteBox_testing() {
		int[] Nullnumber = null;
		assertEquals(0,CountClump.countClumps(Nullnumber));
		int[] Emptynumber = {};
		assertEquals(0,CountClump.countClumps(Emptynumber));
		int[] number = {1,1,1,2,3};
		assertEquals(1,CountClump.countClumps(number));
		
		
	}

}
