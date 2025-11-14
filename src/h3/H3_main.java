package h3;

public class H3_main {
	public static void main(String[] args) {
		float celsiusFloat = 16F, fahrenheitFloat = 1;
		
		double celsiusDouble = 16, fahrenheitDouble = 5;
		
		fahrenheitFloat = celsiusFloat * (float) 9 / 5 + 32;
		fahrenheitDouble = celsiusDouble * (float) 9 / 5 + 32;
		
		System.out.println("Float -> Celsius: " + celsiusFloat + "; -> Fahrenheit: " + fahrenheitFloat);
		System.out.println("Double -> Celsius: " + celsiusDouble + "; -> Fahrenheit: " + fahrenheitDouble);
	}
}
