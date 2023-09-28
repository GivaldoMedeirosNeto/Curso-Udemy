package controle;

import java.util.Scanner;

public class DesafioDiaSemana {

	public static void main(String[] args) {
		
		System.out.println("Digite um numero entre 1 a 7.");
		Scanner entrada = new Scanner(System.in);
		int dia = entrada.nextInt();
		
		if(dia > 8 || dia < 1) {
			System.out.println("Numero inváldio!");
		} else if (dia == 1) {
			System.out.println("Domingo");
		} else if (dia == 2) {
			System.out.println("Segunda");
		}  else if (dia == 3) {
			System.out.println("Terça");
		}  else if (dia == 4) {
			System.out.println("Quarta");
		} else if (dia == 5) {
			System.out.println("Quinta");
		} else if (dia == 6) {
			System.out.println("Sexta");
		} else if (dia == 7) {
			System.out.println("Sábado");
		}
		
		System.out.println("Escreva o dia da Semana.");
		String semana = entrada.next();
		
		if(semana.equalsIgnoreCase("domingo")) {
			System.out.println("1");
		} else if (semana.equalsIgnoreCase("segunda")) {
			System.out.println("2");
		}  else if (semana.equalsIgnoreCase("terça")
				|| semana.equalsIgnoreCase("terca")) {
			System.out.println("3");
		}  else if (semana.equalsIgnoreCase("quarta")) {
			System.out.println("4");
		}  else if (semana.equalsIgnoreCase("quinta")) {
			System.out.println("5");
		}  else if (semana.equalsIgnoreCase("sexta")) {
			System.out.println("6");
		}  else if (semana.equalsIgnoreCase("sábado")
				|| semana.equalsIgnoreCase("sabado")) {
			System.out.println("7");
		} else {
			System.out.println("Semana inválida.");
		}
		
		System.out.println("Fim!!!!");
		entrada.close();
		
	}
	
}
