package fundamentos.aulas;

public class Inferencia {

	public static void main(String[] args) {
		
		double a = 4.5; // Declaração e Inicialização da variável
		System.out.println(a); // Mostrando a variável
		
		var b = 3.4; // Inferencia de uma variável
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		
		
		double d; // Declarando a variável
		d = 123.12; // Inicializando a variável
		System.out.println(d); // Mostrando a variável
		
		
		var e = "teste";
		System.out.println(e);
		e = "Teste 2";
		System.out.println(e);
		
	}
}
