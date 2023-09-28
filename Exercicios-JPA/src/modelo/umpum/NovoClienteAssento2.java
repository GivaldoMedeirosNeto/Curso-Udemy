package modelo.umpum;

import infra.DAO;

public class NovoClienteAssento2 {
	
public static void main(String[] args) {
		
		Assento assento = new Assento("4E");
		Cliente cliente = new Cliente("Rodrigo", assento);		
		DAO<Cliente> dao = new DAO<>(Cliente.class);

		dao.incluirAtomico(cliente);
		
	}

}
