package oo.desafio;

public class Ferrari extends Carro implements Esportivo, Luxo{

	private boolean ligarTurbo = false;
	private boolean ligarAr = false;
	
	Ferrari(){
		this(315);
	}
		
	Ferrari(int velocidadeMaxima){
		super(velocidadeMaxima);
		setVelocidade(15);
	}
	
	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
	}
	
	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
	}
	
	@Override
	public void ligarAr() {
		ligarAr = true;
	}
	
	@Override
	public void desligarAR() {
		ligarAr = false;
	}
	
	@Override
	public int getVelocidade() {
		
		if(ligarTurbo && !ligarAr) {
			return 35;
		} else if(ligarTurbo && ligarAr) {
			return 30;
		} else if(!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;			
		}
		
	}
	
	/*
	@Override
	void acelerar() {
		super.acelerar();
		// velocidadeAtual += 15;
	}
	*/
}
