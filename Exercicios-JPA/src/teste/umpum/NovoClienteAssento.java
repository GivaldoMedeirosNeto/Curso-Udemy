package teste.umpum;

import infra.DAO;
import modelo.umpum.Assento;
import modelo.umpum.Cliente;

public class NovoClienteAssento {
	
	public static void main(String[] args) {
		
		Assento assento = new Assento("16A");
		Cliente cliente = new Cliente("Carlos", assento);		
		DAO<Object> dao = new DAO<>();
		
		dao.abrirTransacao()
			.incluirTransacao(assento)
			.incluirTransacao(cliente)
			.fecharTransacao()
			.fechar();
		
	}

}
