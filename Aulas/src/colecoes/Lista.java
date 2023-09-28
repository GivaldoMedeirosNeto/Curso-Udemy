package colecoes;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		
		ArrayList<ListaUsuario> lista = new ArrayList<>();
		
		ListaUsuario u1 = new ListaUsuario("Penelope");
		lista.add(u1);
		lista.add(new ListaUsuario("Givaldo"));
		lista.add(new ListaUsuario("Mayara"));
		lista.add(new ListaUsuario("Twikki"));
		lista.add(new ListaUsuario("Kira"));
		
		System.out.println(lista.get(0));
		
		for(ListaUsuario u: lista) {
			System.out.println(u.nome);
		}
		
	}

}
