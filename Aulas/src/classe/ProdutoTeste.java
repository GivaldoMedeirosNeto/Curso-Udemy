package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto produto = new Produto("Notebook", 4356.89);
		double vlProduto1 = produto.precoComDesconto(0);
		
		var produto2 = new Produto();
		produto2.nome = "Caneta Preta";
		produto2.preco = 12.56;
		double vlProduto2 = produto2.precoComDesconto();
		
		double carrinho = vlProduto1 + vlProduto2;
		
		System.out.println(produto.nome);
		System.out.println(produto2.nome);
		System.out.printf("Total R$ %.2f\n", carrinho);		
		
	}

}
