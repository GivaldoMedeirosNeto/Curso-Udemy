package oo.encapsulamento.GettersSetters;

public class Pessoa {
	
	private int idade;
	
	public Pessoa(int idade) {
		this.setIdade(idade);
	}
	
	public int getIdade() {
		return this.idade;
	}
	
	public void setIdade(int idade) {
		idade = Math.abs(idade);
		if(idade >= 0 && idade <=99) {
			this.idade = idade;			
		}		
	}

}
