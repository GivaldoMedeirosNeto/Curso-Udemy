package lambdas;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	/*
	 * 1. A partir do produto calcular o preço real (com desconto);
	 * 2. Imposto Municipal: >= 2500(8,5%), < 2500 (isento);
	 * 3. Frente: >= 3000 (R$100), < 3000(R$50);
	 * 4. Arredondar: Deixar duas casas decimais;
	 * 5. Formatar: "R$" 1234","56;
	 */
	
	public static void main(String[] args) {
		
		/*1. A partir do produto calcular o preço real (com desconto);*/
		Function<Produto, Double> precoFinal = 
				produto -> produto.preco * (1 - produto.desconto);
			
		/*2. Imposto Municipal: >= 2500(8,5%), < 2500 (isento);*/
		UnaryOperator<Double> impostoMunicipal = 
				preco -> preco >= 2500 ? preco * 1.085 : preco;
		
		/*3. Frente: >= 3000 (R$100), < 3000(R$50);*/
		UnaryOperator<Double> frete = 
				preco -> preco >= 3000 ? preco + 100 : preco + 50;
			
		/*4. Arredondar: Deixar duas casas decimais;
		UnaryOperator<Double> arredondar = 
				preco -> Double.parseDouble(String.format("%.2f", preco));
		Sistema esta gereando erro neste cod.*/
		
		/*5. Formatar: "R$" 1234","56*/
		Function<Double, String> formatar = 
				preco -> "R$ " + String.format("%.2f", preco);
				
		Produto p = new Produto("Notbook Samsung X50", 3235.89, 0.35);
		
		String resultado = precoFinal
			.andThen(impostoMunicipal)
			.andThen(frete)
			.andThen(formatar)
			.apply(p);
		
		System.out.println(resultado);
	}

}
