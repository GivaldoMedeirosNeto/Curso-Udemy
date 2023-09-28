package lambdas;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parImpar = numero -> numero % 2 == 0 ? "Par" : "Ímpar";	
		
		Function<String, String> resultado = valor -> "O resultado é: " + valor;
		
		Function<String, String> empolgado = valor -> valor + " !!!";
		
		String resultadoFinal = parImpar
				.andThen(resultado)
				.andThen(empolgado)
				.apply(33);
		
		System.out.println(resultadoFinal);
		System.out.println(parImpar.apply(34));
		
	}

}
