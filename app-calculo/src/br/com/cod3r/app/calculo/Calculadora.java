package br.com.cod3r.app.calculo;

import br.com.cod3r.app.calculo.interno.OperacoesAritimeticas;
import br.com.cod3r.app.logging.Logging;

public class Calculadora {
	
	private OperacoesAritimeticas opAritimetica = new OperacoesAritimeticas();

	public double soma(double... nums) {
		Logging.info("Somando ... ");
		return opAritimetica.soma(nums);
	}
	

}
