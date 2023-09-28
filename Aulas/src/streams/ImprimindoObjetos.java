package streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("May", "Ana", "Gi", "Pri");
		
		System.out.println("Imprimindo pelo FOREACH...");
		for(String nome: aprovados) {
			System.out.println(nome);
		}
		
		System.out.println("\nImprimindo pelo ITERATOR...");
		Iterator<String> iterator = aprovados.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		System.out.println("\nImprimindo pelo STREAM...");
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println); // Laço interno
	}

}
