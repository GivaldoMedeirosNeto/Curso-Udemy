package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {
	
		double a = 2;
		double b = a; // atribuição por valor (tipo primitivo)
		
		a++;
		b--;
		
		System.out.println(a + " - " + b);
		
		Data d1 = new Data(01, 12, 2022);
		Data d2 = d1; // atribuição por referencia (Objeto)
		
		d1.dia = 31;
		d2.mes = 06;
		
		System.out.println(d1.dataFormatada());
		System.out.println(d2.dataFormatada("-"));
		
		voltarDataPadrao(d1);
		
		System.out.println(d2.dataFormatada("-"));
		
	}
	
	static void voltarDataPadrao(Data data) {
		data.dia = 01;
		data.mes = 01;
		data.ano = 1970;
	}
	
}
