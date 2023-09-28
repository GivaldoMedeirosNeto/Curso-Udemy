package fundamentos.operadores;

public class Aritimetricos {

	public static void main(String[] args) {
		
		System.out.println(2 + 3);
		
		var x = 3.3;
		double y = 2.2;
		
		System.out.println("ATV 01: " + x + y);
		System.out.println("ATV 01: " + (x - y));
		System.out.println("ATV 01: " + x * y);
		System.out.println("ATV 01: " + x / y);
		
		int a = 3;
		int b = 2;
		System.out.println("ATV 02: " + a + b);
		System.out.println("ATV 02: " + (a - b));
		System.out.println("ATV 02: " + a * b);
		System.out.println("ATV 02: " + a / b);
		System.out.println("ATV 02: " + a / (double) b);

		int c = 2;
		var d = 3.2;
		System.out.println("ATV 03: " + c + d);
		System.out.println("ATV 03: " + (a - d));
		System.out.println("ATV 03: " + a * d);
		System.out.println("ATV 03: " + d / d);
		
		System.out.println("ATV 04: " + a % b);
		
		System.out.println("ATV 05: " + Math.pow(a, 3));
		System.out.println("ATV 05: " + (int)  Math.pow(a, 3));
		
	}
}
