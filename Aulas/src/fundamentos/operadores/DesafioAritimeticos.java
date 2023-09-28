package fundamentos.operadores;

public class DesafioAritimeticos {

	public static void main(String[] args) {

		double numA = Math.pow((6 * (3+2)), 2);
		double superiorA = numA / (3*2);
		
		double numB = ((1-5) * (2-7) / 2);
		double superiorB = Math.pow(numB, 2);
		
		double superior = Math.pow(superiorA - superiorB, 3);
		
		double resultado = superior / Math.pow(10, 3);
		
		System.out.println("O resultado é: " + (int) resultado);
				
	}
}
