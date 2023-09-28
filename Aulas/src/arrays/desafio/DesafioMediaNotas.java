package arrays.desafio;

import java.util.Scanner;

public class DesafioMediaNotas {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe quantas notas irá ser inseridas: ");
		double notas[] = new double[entrada.nextInt()];
		
		for(int i = 0; i < notas.length; i++) {
			System.out.print("Informe a nota " + (i+1) + ": ");
			notas[i] = entrada.nextDouble();			
		}
		
		double total = 0;
		for(double nota: notas) {
			total += nota;
		}
		
		System.out.println("\nA média das notas informadas é de " + (total/notas.length));
				
		entrada.close();
		
	}

}
