package oo.composicao;

public class TesteCurso {
	
	public static void main(String[] args) {
		
		Aluno aluno1 = new Aluno("João");
		Aluno aluno2 = new Aluno("Judas");
		Aluno aluno3 = new Aluno("José");
		
		Curso curso1 = new Curso("Java Desktop");
		Curso curso2 = new Curso("Java Web");
		Curso curso3 = new Curso("React Native");
		
		curso1.addAluno(aluno1);
		curso1.addAluno(aluno2);
		
		curso2.addAluno(aluno3);
		
		aluno1.addCurso(curso3);
		aluno2.addCurso(curso3);
		aluno3.addCurso(curso3);
		
		for(Aluno aluno : curso3.alunos) {
			System.out.println("Estou matriculado no curso" + 
						curso3.nome + "...");
			System.out.println("... e o meu nome é " + aluno.nome);
			System.out.println();
		}
		
		System.out.println(aluno1.cursos.get(0).alunos);
		
		Curso cursoEncontrado = aluno1.obterCursoPorNome("Java Desktop");
		
		if(cursoEncontrado != null) {
			System.out.println(cursoEncontrado.alunos);
		}
		
		
	}

}
