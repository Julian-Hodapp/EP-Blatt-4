package p3;

public class P3_main {
	public static void main(String[] args) {
		boolean y = false, x = false;
		
		boolean test = false;
		
		y = true;
		x = true;
		
		System.out.println("x = true; y = true");
		
		test = !(x!=y && x==y);
		System.out.println("a) !(x!=y && x==y): " + test);
		//True, da x nicht gleichzeitig false und true sein kann !!Das nicht am Anfang beachten!!
		
		test = x || true;
		System.out.println("b) x || true: " + test);
		//True, da egal ob x true oder false ist, der zweite Teil der Oder-Aussage ist immer true und damit auch die Oder-Aussage
		
		test = x && false;
		System.out.println("c) x && false: " + test);
		//False, da egal ob x true oder false ist, der zweite Teil Und-Aussage ist immer false und damit ist auch die Und-Aussage falsch
		
		test = (x&&!y)||(!x);
		System.out.println("d) (x&&!y)||(!x): " + test);
		//False, da (x&&!y) false ist (x = true; y = true), und da (!x) false ist (x = true)
		
		y = true;
		x = false;
		
		System.out.println("");
		System.out.println("x = true; y = false");
		
		test = !(x!=y && x==y);
		System.out.println("a) !(x!=y && x==y): " + test);
		//True, da x nicht gleichzeitig false und true sein kann !!Das nicht am Anfang beachten!!
		
		test = x || true;
		System.out.println("b) x || true: " + test);
		//True, da egal ob x true oder false ist, der zweite Teil der Oder-Aussage ist immer true und damit auch die Oder-Aussage
		
		test = x && false;
		System.out.println("c) x && false: " + test);
		//False, da egal ob x true oder false ist, der zweite Teil Und-Aussage ist immer false und damit ist auch die Und-Aussage falsch
		
		test = (x&&!y)||(!x);
		System.out.println("d) (x&&!y)||(!x): " + test);
		//False, da (x&&!y) false ist (x = true; y = true), und da (!x) false ist (x = true)
		
	}
}
