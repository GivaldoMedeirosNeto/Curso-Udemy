package fundamentos.operadores;

public class Ternario {
	public static void main(String[] args) {
		
		double nota = 7.3;
		
		String recuperacao = nota >= 4 ? "em Recuperação." : "Reprovado.";
		String resultado = nota >= 7.5 ? "Aprovado." : recuperacao;
		System.out.println("O Aluno está " + resultado);
	}

}
