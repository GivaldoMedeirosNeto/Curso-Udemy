package teste.umpmuitos;

import infra.DAO;
import modelo.umpmuitos.ItemPedido;
import modelo.umpmuitos.Pedido;

public class ObterPedido {
	
	public static void main(String[] args) {
		
		DAO<Pedido> dao = new DAO<>(Pedido.class);
		Pedido pedido = (Pedido) dao.obterPorID(1L);
		
		for(ItemPedido item: pedido.getItens()){
			System.out.println(item.getQtd());
			System.out.println(item.getProduto().getNome());
		}
		
		dao.fechar();
	}

}
