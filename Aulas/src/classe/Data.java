package classe;

public class Data {

	int dia;
	int mes;
	int ano;
	final String formato = "%d/%d/%d";
	
	Data() {
		this(1, 1, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
		
	}
	
	String dataFormatada() {
		return String.format(formato, dia, mes, ano);
	}
	
	String dataFormatada(String tipo) {
		return String.format(formato.replace("/", tipo), dia, mes, ano);
	}
	
	void  imprimirDataFormatada() {
		System.out.println(dataFormatada());
	}
	
}
