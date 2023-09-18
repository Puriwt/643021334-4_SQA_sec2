package stubAndDriver;

import main.IngredientConverter;

public class StubIngredient extends IngredientConverter {
	
	public double convert(double value, String choice, String fromUnit, String toUnit) {
		return 80.0;
	}
}
