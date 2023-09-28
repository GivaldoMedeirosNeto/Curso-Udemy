package fundamentos.aulas;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		
		System.out.print("Bom");
		System.out.print(" dia!");
		System.out.println("bom.");
		System.out.printf("Mega Sena: %d %d %d %d %d %d %n", 1, 2, 3, 4, 5, 6);
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("");
		System.out.println("Nome = " + nome);
		
		
		
		entrada.close();
		
	}

}
