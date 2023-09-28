package fundamentos.aulas;

public class TipoString {
	public static void main(String[] args) {
		
		System.out.println("Olá pessoal".charAt(4));
		
		String s = "Boa Tarde";
		System.out.println(s.concat("!!!"));
		System.out.println(s + "!?");
		
		s = "Bom dia";
		System.out.println(s);
		
		System.out.println(s.startsWith("bom"));
		System.out.println(s.toLowerCase().startsWith("bom"));
		System.out.println(s.length());
		System.out.println(s.endsWith("dia"));
		
		System.out.println(s.equals("bom dia"));
		System.out.println(s.equalsIgnoreCase("bom dia"));
		
		var nome = "Pedro";
		var sobrenome = "Santos";
		var salario = 12345.987;
		
		System.out.println("Nome: " + nome +"\nSobrenome: " +  sobrenome);
		System.out.printf("Nome: %s %s ganha R$%.2f\n", nome, sobrenome, salario);
		
		String frase = String.format("Nome: %s %s ganha R$%.2f", nome, sobrenome, salario);
		System.out.println(frase);
		
		System.out.println("Frase qualuer".contains("qual"));
		System.out.println("Frase qualuer".indexOf("qual"));
		System.out.println("Frase qualuer".substring(6));
		System.out.println("Frase qualuer".substring(6, 10));
		
		
	}

}
