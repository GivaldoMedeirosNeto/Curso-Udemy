package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
	
	public static void main(String[] args) {
		
		Set<String> lista = new HashSet<>();
		
		lista.add("Mayara");
		lista.add("Givaldo");
		lista.add("Penelope");
		
		System.out.println(lista);
		
		for(String listas: lista) {
			System.out.println(listas);
		}
		
		SortedSet<Integer> ListN = new TreeSet<>();
		
		ListN.add(5);
		ListN.add(6);
		ListN.add(4);
				
		System.out.println(ListN);
		
		for(int listasN: ListN) {
			System.out.println(listasN);
		}
		
	}

}
