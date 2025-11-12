package p2;

public class P2_main {
	public static void main(String[] args) {
		int a = 3, b = 5, c = 6;
		double x = 1.5, y = 2.3;
		
		int intResult = 4;
		double doubleResult = 4.5;
		
		int aAnweisung = c - a * 3;
		//Frage 1: der Typ der Ausgegeben wird ist int
		//Frage 2: Ja, die zuweisung lässt sich ohne Kompilerfehler ausführen
		
		
		int bAnweisung = c / b;
		//Frage 1: der Typ der Ausgegeben wird ist ein Integer
		//Frage 2: Ja, die Zuweisung lässt sich ohne Kompilerfehler ausführen
		
		int cAnweisung = a + b / c;
		//Frage 1: der Typ der Ausgegeben wird ist ein Integer
		//Frage 2: Ja, die Zuweisung lässt sich ohne Kompilerfehler ausführen
		
		double dAnweisung = c / b;
		//Frage 1: der Typ der Ausgegeben wird ist ein Integer
		//Frage 2: Ja, die Zuweisung lässt sich ohne Kompilerfehler ausführen
		
		double eAnweisung = c + a / b;
		//Frage 1: der Typ der Ausgegeben wird ist ein Integer
		//Frage 2: Ja, die Zuweisung lässt sich ohne Kompilerfehler ausführen
		
		double fAnweisung = x + y * b;
		//Frage 1: es kann kein Wert ausgegeben werden
		//Frage 2: Ja, die Zuweisung lässt sich ohne Kompilerfehler ausführen
		
		intResult = c / b;
		doubleResult = x + y * b;
		
		System.out.println("intResult: " + intResult);
		System.out.println("doubleResult: " + doubleResult);
		
		
	}
}
