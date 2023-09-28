package oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {
	
	final ArrayList<Item> itens = new ArrayList<Item>();
	
	
	void addItem(Produto p, int qtd) {
		this.itens.add(new Item(p, qtd));
	}
	
	void addItem(String nome, int qtd, double preco) {
		this.itens.add(new Item(new Produto(nome, preco), qtd));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtd * item.produto.preco;
		}
		
		return total;
	}	

}
