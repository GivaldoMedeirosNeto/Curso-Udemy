package padroes.observer;

public class Festa {
	
	public static void main(String[] args) {
		Porteiro porteiro = new Porteiro();
		
		Namorada namorada = new Namorada();
		porteiro.registrarObservador(namorada);
		
		// Via Lambda
		porteiro.registrarObservador(e -> System.out.println("Supresa simples " + e.getData()));
		
		porteiro.monitorar();
		
	}

}
