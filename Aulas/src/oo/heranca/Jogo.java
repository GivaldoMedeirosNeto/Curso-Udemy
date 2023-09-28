package oo.heranca;

public class Jogo {
	
	public static void main(String[] args) {
	
		Mostro mostro = new Mostro();
		mostro.vidaExtra();
		mostro.x = 10;
		mostro.y = 10;
		
		Heroi heroi = new Heroi();
		heroi.x = 10;
		heroi.y = 11;
		
		System.out.println("Vida do Mostro: " + mostro.vida);
		System.out.println("Vida do Heroi: " + heroi.vida);
		
		mostro.atacar(heroi);
		heroi.atacar(mostro);
		
		System.out.println("Vida do Mostro: " + mostro.vida);
		System.out.println("Vida do Heroi: " + heroi.vida);
		
		
	}
	
}
