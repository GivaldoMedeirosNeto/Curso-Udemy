package teste.muitospmuitos;

import infra.DAO;
import modelo.muitospmuitos.Sobrinho;
import modelo.muitospmuitos.Tio;

public class NovoTioSobrinho {
	
	public static void main(String[] args) {
		
		Tio tia = new Tio("Maria Helena");
		Tio tio = new Tio("Joao Henrique");
		
		Sobrinho sobrinho = new Sobrinho("Davi Junior");
		Sobrinho sobrinha = new Sobrinho("Ana Lucia");
		
		tia.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tia);
		
		tia.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tia);
		
		tio.getSobrinhos().add(sobrinho);
		sobrinho.getTios().add(tio);
		
		tio.getSobrinhos().add(sobrinha);
		sobrinha.getTios().add(tio);
		
		DAO<Object> dao = new DAO<>();
		dao.abrirTransacao()
			.incluirTransacao(tia)
			.incluirTransacao(tio)
			.incluirTransacao(sobrinho)
			.incluirTransacao(sobrinha)
			.fecharTransacao().fechar();
		
	}

}
