package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pila {
	
	public static void main(String[] args) {
		
		Deque<String> pila = new ArrayDeque<String>();
		
		pila.add("Penelope");
		pila.push("Givaldo");
		pila.push("Twikki");
		
		System.out.println(pila);
		
		System.out.println(pila.peek());
		System.out.println(pila.element());
		
		System.out.println(pila.poll());
		System.out.println(pila.remove());
		System.out.println(pila.pop());
		
		
	}

}
