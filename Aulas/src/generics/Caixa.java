package generics;

public class Caixa<Tipo> {

private Tipo coisa;
	
	public void guardar(Tipo coisa) {
		this.coisa = coisa;
	}
	
	public Tipo abrir() {
		return coisa;
	}
	
}
