package classe.desafio;

public class Pessoa {
	
	String nome;
	double peso;
	
	Pessoa(String nome, double peso){
		this.nome = nome;
		this.peso = peso;
	}
	
	Pessoa(){
	
	}
	
	void comer(Comida comida) {
		if(comida != null) {
			this.peso += comida.peso;
		}
	}
	
	String apresentar() {
		
		if(this.nome != null) {
			return "Nome: " + this.nome + "\nPeso: " + this.peso + "Kg.";
		} else {
			return "Olá,\n ainda não sou ninguem!!!";
		}
		
	}

}
