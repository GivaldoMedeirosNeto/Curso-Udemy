package lambdas;

public class CalculoTeste {

	public static void main(String[] args) {
		
		Calculo calculo = new Somar();		
		System.out.println(calculo.execultar(2, 3));
		
		calculo = new Multiplicar();
		System.out.println(calculo.execultar(2, 3));
		
	}
	
}
