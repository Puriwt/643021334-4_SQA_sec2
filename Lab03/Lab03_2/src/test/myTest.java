package test;

import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.Test;

import main.LockedScreen;



class myTest {
	LockedScreen lockedScreen;
	@BeforeEach
	void setUp() {
		lockedScreen = new LockedScreen();
	}
	
	@RepeatedTest(value = 3, name = RepeatedTest.LONG_DISPLAY_NAME)
	@Test
	@DisplayName("TS001 : Incorrect 3 time")
	void Incorrect3Time() {
		assertEquals(false,lockedScreen.onReceive(12345, false));
	}


}
