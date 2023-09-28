package oo.composicao;

import java.util.ArrayList;

public class Compra {

	ArrayList<Item> itens = new ArrayList<Item>();	
	String cliente;
	
	void adicionarItem (Item item) {
		itens.add(item);
		item.compra = this;
	}
	
	void adicionarItem (String nome, int qtd, double preco) {
		this.adicionarItem(new Item(nome, qtd, preco));
	}
	
	double getValorTotal() {
		double total = 0;
		
		for(Item item: itens) {
			total += item.qtd * item.preco;
		}
		
		return total;
	}
}
