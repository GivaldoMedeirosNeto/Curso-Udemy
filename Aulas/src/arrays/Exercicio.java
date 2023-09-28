package arrays;

import java.util.Arrays;

public class Exercicio {
	
	public static void main(String[] args) {
		
		//double[] notasAlunos = new double[3];
		double notasAlunos[] = new double[3];
		
		notasAlunos[0] = 7.9;
		notasAlunos[1] = 8;
		notasAlunos[2] = 6.7;
		
		System.out.println(notasAlunos); // Irá apresentar o index do array
		System.out.println(Arrays.toString(notasAlunos)); // irá mostrar todo o array.
		
		double total = 0;
		for(int i = 0; i < notasAlunos.length; i++) {
			total += notasAlunos[i];
		}
		
		System.out.println(total);
		
	}

}
