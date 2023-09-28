package generics;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<Chave extends Number, Valor> {

	private final Set<Par<Chave, Valor>> itens = new LinkedHashSet<>();
	
	public void adicionar(Chave c, Valor v) {
		if(c == null) return;
		
		Par<Chave, Valor> novoPar = new Par<Chave, Valor>(c, v);
		if(itens.contains(novoPar)) {
			itens.remove(novoPar);
		}
		
		itens.add(novoPar);
	}
	
	public Valor getValor(Chave c) {
		if(c == null) return null;
		
		Optional<Par<Chave, Valor>> parOpcional = itens.stream().filter(p -> c.equals(p.getChave())).findFirst();
		
		return parOpcional.isPresent() ? parOpcional.get().getValor() : null;
	}
	
}
