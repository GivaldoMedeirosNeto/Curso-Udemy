package controle;

import java.util.Scanner;

public class DesafioDoWhile {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int qtd = 0;
		double nota = 0;
		double total = 0;
		
		System.out.println("Calcular a Média(para sair informe -1)");
		while(nota != -1) {
			System.out.print("Informe a nota: ");
			nota = entrada.nextDouble();
			
			if(nota <= 10 && nota >= 0) {
				total += nota;
				qtd++;
			} else if (nota != -1) {
				System.out.println("Nota inválida !!!");
			}
					
		}
		
		double media = total/qtd;
		System.out.println("\nA media das notas informadas é: " + media);
		entrada.close();
		
	}

}
