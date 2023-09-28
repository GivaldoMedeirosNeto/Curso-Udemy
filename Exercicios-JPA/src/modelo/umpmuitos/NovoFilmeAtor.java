package modelo.umpmuitos;

import infra.DAO;
import modelo.muitospmuitos.Ator;
import modelo.muitospmuitos.Filme;

public class NovoFilmeAtor {
	
	public static void main(String[] args) {
		
		Filme filmeA = new Filme("Star Wars - EP 4", 8.7);
		Filme filmeB = new Filme("O Fugitivo", 7.9);
		Ator atorA = new Ator("Harrison Ford");
		Ator atorB = new Ator("Carrie Fisher");
		
		filmeA.addAtor(atorA);
		filmeA.addAtor(atorB);
		filmeB.addAtor(atorA);
		
		DAO<Filme> dao = new DAO<Filme>();
		dao.incluirAtomico(filmeA);
		
	}

}
