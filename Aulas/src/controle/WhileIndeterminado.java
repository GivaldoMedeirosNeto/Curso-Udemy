package controle;

import java.util.Scanner;

public class WhileIndeterminado {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String valor = "";
		int cont = 0;
		
		while(!valor.equalsIgnoreCase("sair")) {
			
			System.out.println("Digite um valor: ");
			valor = entrada.nextLine();
			cont++;
			
		}
		
		System.out.println("Você digitou: " + cont + " vezes antes do programa fechar!");
		entrada.close();
		
	}
	
}
