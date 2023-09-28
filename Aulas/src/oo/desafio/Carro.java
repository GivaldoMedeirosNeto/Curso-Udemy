package oo.desafio;

public class Carro {
	
	final int VELOCIDADE_MAXIMA;
	int velocidadeAtual;
	private int velocidade = 5;
	
	
	
	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	Carro(int velocidadeMaxima){
		this.VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	void acelerar() {
		if(velocidadeAtual + getVelocidade() > VELOCIDADE_MAXIMA) {
			velocidadeAtual = VELOCIDADE_MAXIMA;
		} else {		
			velocidadeAtual += getVelocidade();			
		}
		
	}
	
	void frear() {
		
		if(velocidadeAtual >= velocidade) {
			velocidadeAtual-= velocidade;			
		} else {
			velocidadeAtual = 0;
		}
		
	}
	
	public String toString() {
		return "Sua velocidade é " + velocidadeAtual + " km/h";
	}

}
