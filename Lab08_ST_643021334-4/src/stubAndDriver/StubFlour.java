package stubAndDriver;

import main.FlourConverter;

public class StubFlour extends FlourConverter {
	
	public double getMultiplier(String fromUnit, String toUnit) {
		return 10.0;
	}

}
