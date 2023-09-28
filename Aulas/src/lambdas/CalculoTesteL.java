package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTesteL {
	
	public static void main(String[] args) {
		
		Calculo calculo = (a, b) -> { return a + b; };		
		System.out.println(calculo.execultar(2, 3));
		
		calculo = (a, b) -> a * b;
		System.out.println(calculo.execultar(2, 3));
		
		System.out.println(calculo.legal());
		System.out.println(Calculo.muitoLegal());
		
		
		BinaryOperator<Double> calc = (x, y) -> { return x + y; };
		System.out.println(calc.apply(2.0, 3.0));
		
	}

}
