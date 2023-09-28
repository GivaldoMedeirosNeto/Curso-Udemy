package oo.polimorfismo;

public class Jantar {

	public static void main(String[] args) {
		
		Pessoa convidado = new Pessoa(99.65);
		System.out.printf("%.2f",convidado.getPeso());
		
		Arroz arroz = new Arroz(0.25);
		convidado.comer(arroz);
		System.out.printf("\n%.2f",convidado.getPeso());
		
		Feijao feijao = new Feijao(0.18);
		convidado.comer(feijao);
		System.out.printf("\n%.2f",convidado.getPeso());
		
		Sorvete sorvete = new Sorvete(0.30);
		convidado.comer(sorvete);
		System.out.printf("\n%.2f",convidado.getPeso());
		
	}
	
}
