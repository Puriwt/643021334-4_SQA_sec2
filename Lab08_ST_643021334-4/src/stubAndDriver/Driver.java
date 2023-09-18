package stubAndDriver;

import main.IngredientConverter;

public class Driver {
	public static void main(String[] args) {
		double value = 7.0; 
		String choice = "flour"; 
		String fromUnit = "teaspoon"; 
		String toUnit = "gram";
		double result = 0.0;
		
		IngredientConverter converter = new IngredientConverter();
		
		result = converter.convert(value, choice, fromUnit, toUnit);
		System.out.println(choice+" : "+value+" "+fromUnit+" = "+result+" "+toUnit);
	}
}
