package classe;

public class DataTeste {

	public static void main(String[] args) {
		
		Data data = new Data(11, 10, 1985);
		
		System.out.println(data.dataFormatada());
		System.out.println(data.dataFormatada("-"));
		data.imprimirDataFormatada();
		
		var data2 = new Data();
		
		System.out.println(data2.dataFormatada());
		System.out.println(data2.dataFormatada("-"));
		data2.imprimirDataFormatada();
		
	}
	
}
