package lambdas;

@FunctionalInterface
public interface Calculo {
	
	double execultar(double a, double b);
	
	default String legal() {
		return "legal";
	}
	
	static String muitoLegal() {
		return " Muito Legal";
	}

}
