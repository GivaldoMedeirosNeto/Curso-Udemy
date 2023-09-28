package teste.umpmuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpmuitos.ItemPedido;
import modelo.umpmuitos.Pedido;

public class NovoPedido {
	
	public static void main(String[] args) {
		
		DAO<Object> dao = new DAO<>();
		Produto produto = new Produto("Geladeira", 2789.99);
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(10, pedido, produto);
		
		
		dao.abrirTransacao()
			.incluirTransacao(produto)
			.incluirTransacao(pedido)
			.incluirTransacao(item)
			.fecharTransacao().fechar();
		
	}

}
