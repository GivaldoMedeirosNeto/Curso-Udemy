package fundamentos.aulas;

public class TiposPrimitivos {

	/* Tipos Primitivos 8 Tipos
	 * 
	 * byte		1(byte = 8 bits)
	 * short	2(byte = 8 bits)
	 * int		4(byte = 8 bits)
	 * long		8(byte = 8 bits)
	 * 
	 * float	4(byte = 8 bits)
	 * double	8(byte = 8 bits)
	 * 
	 * char		1 caractere entre ''
	 * boolean	false/true
	 *  
	 */
	
	public static void main(String[] args) {
		// informação do funcionario
		
		// tipos numéricos inteiros
		byte anoDeEmpresa = 23;
		short numeroDeVoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_234_845_223L;
		
		// tipos numérios reais
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		// tipos booleano
		boolean ferias = false;
		
		char status = 'a';
		char unicode = '\u0010';
		
		System.out.println(anoDeEmpresa * 365);
		System.out.println(numeroDeVoos);
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(salario);
		System.out.println(id);
		System.out.println(ferias);
		System.out.println(status);
		System.out.println(unicode);
		
		
		
		
		
	}
}
