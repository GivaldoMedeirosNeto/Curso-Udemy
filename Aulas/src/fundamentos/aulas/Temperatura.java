package fundamentos.aulas;

public class Temperatura {

	public static void main(String[] args) {
		final double FATOR = 5.0 / 9.0;
		final double AJUSTE = 32;
		
		double fahrenheit = 86;			
		double celsius = (fahrenheit - AJUSTE) * FATOR;		
		System.out.println(celsius);
		
		fahrenheit = 86;			
		celsius = (fahrenheit - AJUSTE) * FATOR;		
		System.out.println(celsius);
		
		
	}
}
