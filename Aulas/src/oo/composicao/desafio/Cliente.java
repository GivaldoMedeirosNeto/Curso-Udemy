package oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {
	
	final String nome;
	final ArrayList<Compra> compras = new ArrayList<Compra>();
	
	Cliente(String nome){
		this.nome = nome;
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Compra compra: compras) {
			total += compra.getValorTotal();
		}
		
		return total;
	}
	
	void addCompra(Compra compra) {
		this.compras.add(compra);
	}

}
