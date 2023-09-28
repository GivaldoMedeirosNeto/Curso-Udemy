package exercicios.fundamentos;

import java.util.Scanner;

public class exercicio1 {
	
	/*
	 * Criar um programa que leia a temperatura em Fahrenheit e converta para Celsius
	 */
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Celsius: ");
		double celsius = scanner.nextDouble();
		
		double conversao = ( celsius - 32 ) / 1.8;
		
		System.out.print("Valor em Farenheit: " + conversao);
		
		scanner.close();
		
	}

}
