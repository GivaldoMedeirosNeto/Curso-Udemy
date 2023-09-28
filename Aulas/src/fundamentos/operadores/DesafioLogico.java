package fundamentos.operadores;

public class DesafioLogico {
	public static void main(String[] args) {
		
		boolean trabalhoTerca = false;
		boolean trabalhoQuinta = false;
		
		boolean tv50 = trabalhoTerca && trabalhoQuinta;
		System.out.println("Comprou a TV de 50\"?");
		System.out.println(tv50);
		
		boolean tv32 = trabalhoTerca ^ trabalhoQuinta;
		System.out.println("Comprou a TV de 32\"?");
		System.out.println(tv32);
		
		boolean sorvete = trabalhoTerca || trabalhoQuinta;
		System.out.println("Comprou o Sorvete\"?");
		System.out.println(sorvete);
		
		System.out.println("Mais Saudável?");
		System.out.println(!sorvete);
		
	}

}
