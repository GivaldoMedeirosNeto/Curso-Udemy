package br.com.cod3r.calc.modelo;

import java.util.ArrayList;
import java.util.List;

public class Memoria {
	
	private enum TipoComando {
		ZERAR, NUMERO, DIV, MULT, SUB, SOMA, IGUAL, VIRGULA, SINAL;
	};
	
	private static final Memoria instancia = new Memoria();
	private final List<MemoriaObersavdor> observadores = new ArrayList<>();
	
	private String textoAtual = "";
	private String textoBuffer = "";
	private boolean substituir = false;
	private TipoComando ultimaOperacao = null;

	private Memoria() {
		
	}
	
	public static Memoria getInstancia() {
		return instancia;
	}
	
	public void adicionarObservador(MemoriaObersavdor observador) {
		observadores.add(observador);
	}
	
	public String getTextoAtual() {
		return textoAtual.isEmpty() ? "0" : textoAtual;
	}
	
	public void processarComando(String texto) {
		
		TipoComando tipoComando = detctarTipoComando(texto);
		
		if(tipoComando == null) {
			return;
		} else if(tipoComando == TipoComando.ZERAR){
			textoAtual = "";
			textoBuffer = "";
			substituir = false;
			ultimaOperacao = null;
		} else if(tipoComando == TipoComando.SINAL && textoAtual.contains("-")) {
			textoAtual = textoAtual.substring(1);
		} else if(tipoComando == TipoComando.SINAL && !textoAtual.contains("-")) {
			textoAtual = "-" + textoAtual.substring(1);
		} else if(tipoComando == TipoComando.NUMERO || tipoComando == TipoComando.VIRGULA) {
			textoAtual = substituir ? texto : textoAtual + texto;
			substituir = false;
		} else {
			substituir = true;
			textoAtual = obterResultado();
			textoBuffer = textoAtual;
			ultimaOperacao = tipoComando;
		}
				
		observadores.forEach(o -> o.valorAlterado(getTextoAtual()));
	}

	private String obterResultado() {
		if(ultimaOperacao == null || ultimaOperacao == TipoComando.IGUAL) {
			return textoAtual;
		}
		
		if(textoBuffer.isEmpty()) {
			return textoAtual;
		}
		
		double valorBuffer = Double.parseDouble(textoBuffer.replace(",", "."));
		double valorAtual = Double.parseDouble(textoAtual.replace(",", "."));
		double resultado = 0;
		
		if(ultimaOperacao == TipoComando.SOMA) {
			resultado = valorBuffer + valorAtual;
		} else if(ultimaOperacao == TipoComando.SUB) {
			resultado = valorBuffer - valorAtual;
		} else if(ultimaOperacao == TipoComando.MULT) {
			resultado = valorBuffer * valorAtual;
		}else if(ultimaOperacao == TipoComando.DIV) {
			resultado = valorBuffer / valorAtual;			
		}
		
		String result = Double.toString(resultado).replace(".", ",");
		boolean inteiro = result.endsWith(",0");
		
		
		return inteiro ? result.replace(",0", "") : result;
	}

	private TipoComando detctarTipoComando(String texto) {
		if(textoAtual.isEmpty() && texto == "0") {
			return null;
		}
		
		try {
			Integer.parseInt(texto);
			return TipoComando.NUMERO;
		} catch (NumberFormatException e) {
			if("AC".equalsIgnoreCase(texto)) {
				return TipoComando.ZERAR;
			} else if("/".equalsIgnoreCase(texto)) {
				return TipoComando.DIV;
			} else if("*".equalsIgnoreCase(texto)) {
				return TipoComando.MULT;
			} else if("-".equalsIgnoreCase(texto)) {
				return TipoComando.SUB;
			} else if("+".equalsIgnoreCase(texto)) {
				return TipoComando.SOMA;
			} else if("=".equalsIgnoreCase(texto)) {
				return TipoComando.IGUAL;
			} else if("±".equalsIgnoreCase(texto)) {
				return TipoComando.SINAL;
			} else if(",".equalsIgnoreCase(texto) && !textoAtual.contains(",")) {
				return TipoComando.VIRGULA;
			}
		}
				
		return null;
		
	}
	
}
