package padroes.observer;

public class Namorada implements ObservadorChegadaAniversariante{

	public void chegou(EventoChegdaAniversariante e) {
		System.out.println("Avisar os convidados...");	
		System.out.println("Apagar as Luzes...");	
		System.out.println("Esperar...");	
		System.out.println("... SUPRESA!!!");	
	}
	
}
