package oo.desafio;

public interface Luxo {

	public void ligarAr();
	public void desligarAR();
	
	default int velocidadeAR() {
		return 1;
	}
	
}
