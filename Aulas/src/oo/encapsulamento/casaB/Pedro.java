package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana{
	
	void testeAcessos() {
		
		//Ana mae = new Ana();
		
		// System.out.println(mae.segredo); Privado
		// System.out.println(mae.semSegredo); Pacote
		System.out.println(formaDeFalar);
		System.out.println(todosSabem);
		
	}
}
