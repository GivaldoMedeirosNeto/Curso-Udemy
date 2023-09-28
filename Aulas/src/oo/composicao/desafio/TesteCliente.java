package oo.composicao.desafio;

public class TesteCliente {
	
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente("Penelope Medeiros");
		
		Compra compra1 = new Compra();		
		compra1.addItem("Ração N&D Prime Cordeiro e Blueberry", 1, 51.41);
		compra1.addItem(new Produto("Petisco Whiskas Temptations Antibola de Pelo para Gatos", 9.89), 2);
		
		Compra compra2 = new Compra();		
		compra2.addItem("Areia Higiênica Chalesco com Micro Cristais de Sílica para Gatos", 1, 51.90);
		compra2.addItem(new Produto("Petisco Friskies para Gatos Adultos Sabor Cordeiro, Carne Suína e Carne", 6.52), 4);
		
		Compra compra3 = new Compra();		
		compra3.addItem("Ração Úmida GranPlus Gourmet Sachê para Gatos Adultos Castrados Sabor Frango", 5, 2.87);
		compra3.addItem(new Produto("Purê Churu Atum e Salmão para Gatos", 20.54), 2);
		
		cliente.addCompra(compra1);
		cliente.addCompra(compra2);
		cliente.addCompra(compra3);
		
		System.out.println(cliente.getValorTotal());
		
	}

}
