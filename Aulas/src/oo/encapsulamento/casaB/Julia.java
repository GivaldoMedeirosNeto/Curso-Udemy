package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Julia {

	Ana sogra = new Ana();
	
	void testeAcessos() {
		
		// System.out.println(sogra.segredo); privado
		// System.out.println(sogra.semSegredo); Pacote
		// System.out.println(sogra.formaDeFalar); Herença
		System.out.println(sogra.todosSabem);
		
	}
}
