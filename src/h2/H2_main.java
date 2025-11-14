package h2;

public class H2_main {
	public static void main (String[] args) {
		boolean x = true, y = true, a = true, b = true, c = true;
		
		//hat folgende Definitionsmengen: 0,1,10 oder 11
		int input = 0;
		
		//x und y zuweisen
		if (input == 10 || input == 11) {
			x = true;
		} else {
			x = false;
		}
		
		if (input == 11 || input == 1) {
			y = true;
		} else {
			y = false;
		}
		
		//a, b und c zuweisen, anhand der definierten Eigenschaften
		if(x && y) {
			a = true;
		} else {
			a = false;
		}
		
		if (x || x!= y) {
			b = true;
		} else {
			b = false;
		}
		
		if (y) {
			c = false;
		} else {
			c = true;
		};
		
		System.out.println("input: " + input);
		System.out.println("x: " + x);
		System.out.println("y: " + y);
		System.out.println("a: " + a);
		System.out.println("b: " + b);
		System.out.println("c: " + c);
	}
}
