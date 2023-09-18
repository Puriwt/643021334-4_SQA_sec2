package stubAndDriver;

import main.LiquidConverter;

public class StubLiquid extends LiquidConverter {

	public double getMultiplier(String fromUnit, String toUnit) {
		return 240.0;
	}
}
