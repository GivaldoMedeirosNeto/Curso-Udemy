package colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		/* 
		 * Add e Offer -> Adicionam elementos na fila
		 * diferença é o comportamento quando a fila esá cheia!
		*/
		fila.add("Penelope"); // retorna false
		fila.offer("Givaldo"); // lança uma exceção
		fila.offer("Mayara");
		fila.offer("Kira");
		fila.offer("Twikki");
		
		System.out.println(fila);
		
		/*
		 * Element e Peek -> obter o proximo elemento da fila (sem remover)
		 * diferença é quando a fila está vazia!
		 */
		System.out.println(fila.peek()); // retorna null
		System.out.println(fila.peek()); // lança uma exceção
		System.out.println(fila.element());
		System.out.println(fila.element());
		
		System.out.println(fila.size()); // Tamanho da Fila
		System.out.println(fila.isEmpty()); // Está vazia
		System.out.println(fila.poll()); // Chama o primeiro e depois remove
		System.out.println(fila.remove()); // Chama o primeiro e depois remove, lança uma exceção se estiver vazia
		
		System.out.println(fila);
		fila.clear();  //Limpar a Fila
		System.out.println(fila.isEmpty()); // Está vazia
		
	}
	
}
