package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class NovoProduto {
	
	public static void main(String[] args) {
		
		DAO<Produto> dao = new DAO<>(Produto.class);
		Produto produto = new Produto("Monitor 24", 789.98);
		
		//dao.abrirTransacao().incluirTransacao(produto).fecharTransacao().fechar();
		dao.incluirAtomico(produto).fechar();
		
		System.out.println(produto.getId());
	}

}
