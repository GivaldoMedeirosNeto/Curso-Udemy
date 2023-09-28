package oo.desafio;

public class TesteCarro {
	
	public static void main(String[] args) {
		
		Carro c1 = new Civic();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		c1.acelerar();
		
		System.out.println("Carro Simples " + c1);
		
		c1.frear();
		
		System.out.println("Carro Simples " + c1);
		
		Ferrari c2 = new Ferrari(415);
		c2.acelerar();
		c2.acelerar();
		c1.acelerar();
		c2.acelerar();
		
		System.out.println("Carro Especial " + c2);
		
		c2.frear();
		
		System.out.println("Carro Especial " + c2);
	}

}
