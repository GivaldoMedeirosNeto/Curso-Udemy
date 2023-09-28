package generics;

public class Par<Chave, Valor> {
	
	private Chave chave;
	private Valor valor;
	
	public Par() {
		
	}
	
	public Par(Chave chave, Valor valor) {
		super();
		this.chave = chave;
		this.valor = valor;
	}
	
	public Chave getChave() {
		return chave;
	}
	
	public void setChave(Chave chave) {
		this.chave = chave;
	}
	
	public Valor getValor() {
		return valor;
	}
	
	public void setValor(Valor valor) {
		this.valor = valor;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((chave == null) ? 0 : chave.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Par<?, ?> other = (Par<?,?>) obj;
		if (chave == null) {
			if (other.chave != null)
				return false;
		} else if (!chave.equals(other.chave))
			return false;
		return true;
	}
	
}
