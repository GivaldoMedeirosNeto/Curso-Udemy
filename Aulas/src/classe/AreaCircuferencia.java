package classe;

public class AreaCircuferencia {
	
	double raio;
	final static double PI = 3.14;
	
	AreaCircuferencia(double raio) {
		this.raio = raio;
	}
	
	double area() {
		return PI * Math.pow(raio, 2);
	}
	
	static double area(double raio) {
		return PI * Math.pow(raio, 2);
	}
	
}
