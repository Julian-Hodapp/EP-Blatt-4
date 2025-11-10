package p1;

public class P1_main {
	public static void main(String[] args) {
		int stockwert = 0;
		
		switch(stockwert) {
		case 0:
			System.out.println("Angebote");
			break;
		case 1:
			System.out.println("Damenbekleidung");
			break;
		case 2:
			System.out.println("Herrenbekleidung");
			break;
		case 3:
			System.out.println("Kinderbekleidung");
			break;
		case -1:
			System.out.println("Parkhaus");
			break;
		default:
			System.out.println("unbekannt");
		}
		
		switch(stockwert) {
		case 0:
			System.out.println("Angebote");
			break;
		case 1:
			System.out.println("Damenbekleidung");
			System.out.println("Angebote");
			break;
		case 2:
			System.out.println("Herrenbekleidung");
			System.out.println("Damenbekleidung");
			System.out.println("Angebote");
			break;
		case 3:
			System.out.println("Kinderbekleidung");
			System.out.println("Herrenbekleidung");
			System.out.println("Damenbekleidung");
			System.out.println("Angebote");
			break;
		case -1:
			System.out.println("Parkhaus");
			break;
		default:
			System.out.println("unbekannt");
		}
	}
}
