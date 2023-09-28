package excecao;

public class Basico {
	
	public static void main(String[] args) {
		
		
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException a) {
			System.out.println("erro na divisão" + a.getMessage());
		}
		/*
		 	Exception in thread "main" java.lang.ArithmeticException: / by zero
		 	at excecao.Basico.main(Basico.java:7)
		 */
		
		Aluno a1 = null;
		//impirmirAluno(a1);
		/*
		 	Exception in thread "main" java.lang.NullPointerException: Cannot read field "nome" because "aluno" is null
		 	at excecao.Basico.impirmirAluno(Basico.java:20)
		 	at excecao.Basico.main(Basico.java:15)
		 */
		
		try {
			impirmirAluno(a1);
		} catch (Exception e) {
			System.out.println("Ocorreu um erro no momento da impressão do aluno.");
		}
		
	}
	
	public static void impirmirAluno(Aluno aluno) {
		System.out.println(aluno.nome);
	}

}