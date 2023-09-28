package oo.heranca;

public class Heroi extends Jogador {

	boolean atacar(Jogador oponente) {
		
		/* Metodo que Sobreescreve o método da classe Pai */
		int deltaX = Math.abs(x - oponente.x);
		int deltaY = Math.abs(y - oponente.y);
		
		if(deltaX == 0 && deltaY == 1) {
			oponente.vida -= 20;
			return true;
		} else if(deltaX == 1 && deltaY == 0) {
			oponente.vida -= 20;
			return true;
		} else {
			return false;
		}
		
		/* Metodo que reutiliza o código da classe Pai
		boolean ataque1 = super.atacar(oponente);
		boolean ataque2 = super.atacar(oponente);
		
		return ataque1 || ataque2; 
		*/
		
	}

}
