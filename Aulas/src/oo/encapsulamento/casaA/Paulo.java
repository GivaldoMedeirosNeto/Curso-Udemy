package oo.encapsulamento.casaA;

public class Paulo {
	Ana esposa = new Ana();
	
	void testeAcessos() {
		
		// System.out.println(esposa.segredo); Privado
		System.out.println(esposa.semSegredo);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabem);
		
	}

}
