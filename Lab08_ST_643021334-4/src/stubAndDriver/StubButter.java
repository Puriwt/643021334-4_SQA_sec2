package stubAndDriver;

import main.ButterConverter;

public class StubButter extends ButterConverter {
	
	public double getMultiplier(String fromUnit, String toUnit) {
		return 227.0; // Multiplier
	}

}
