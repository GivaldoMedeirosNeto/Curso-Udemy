package padroes.observer;

import java.util.Date;

public class EventoChegdaAniversariante {
	
	private final Date data;

	public EventoChegdaAniversariante(Date data) {
		this.data = data;
	}
	
	public Date getData() {
		return data;
	}
	
}
