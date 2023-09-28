package exercicios.fundamentos;

import java.util.Scanner;

public class exercicio2 {

	/*
	 * Criar um programa que leia a temperatura em Celsius e converta para Fahrenheit.
	 */
	
	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite a temperatura em Fahrenheit: ");
		double fahrenheit = scanner.nextDouble();
		
		double conversao = fahrenheit * 1.8 + 32 ;
	
		System.out.print("Valor em Celsius: " + conversao);
		
		scanner.close();
		
	}
	
}
