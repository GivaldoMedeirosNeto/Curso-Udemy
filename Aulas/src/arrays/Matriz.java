package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos alunos tem sua turma? ");
		int qtdAlunos = entrada.nextInt();
			
		System.out.print("Quantas Avaliações foram realizadas? ");
		int qtdAvaliacao = entrada.nextInt();
		
		System.out.println();
		
		double turma[][] = new double[qtdAlunos][qtdAvaliacao];
		double totalNotas = 0;
		
		for(int alunos = 0; alunos < turma.length; alunos++) {
			for(int avaliacao = 0; avaliacao < turma[alunos].length; avaliacao++) {
				System.out.printf("Informe a nota %d do aluno %d: ", (avaliacao+1), (alunos+1));
				turma[alunos][avaliacao] = entrada.nextDouble();
				totalNotas += turma[alunos][avaliacao];
			}
		}
		
		double mediaTurma = totalNotas / (qtdAlunos * qtdAvaliacao);
		System.out.println();
		System.out.println("A média da turma é de " + mediaTurma);
		
		for(double notas[]: turma) {
			System.out.println(Arrays.toString(notas));
		}
		
		entrada.close();
		
	}

}
