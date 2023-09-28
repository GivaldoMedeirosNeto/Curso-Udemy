package classe;

public class AreaCircuferenciaTeste {

	public static void main(String[] args) {
	
		AreaCircuferencia a1 = new AreaCircuferencia(10);
		System.out.println(a1.area());
		
		// AreaCircuferencia.pi = 5;
		
		AreaCircuferencia a2 = new AreaCircuferencia(5);
		System.out.println(a2.area());
		
		System.out.println(AreaCircuferencia.area(5));
		
	}	
	
}
