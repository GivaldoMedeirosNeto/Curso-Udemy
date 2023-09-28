package generics;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {
	
	public static void main(String[] args) {
		
		List<String> langs = Arrays.asList("JS","Java","C++","PHP","Delphi");	
		
		String ultimaLangs1 = (String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLangs1);
		
		String ultimaLangs2 = ListaUtil.getUltimo2(langs);
		System.out.println(ultimaLangs2);
		
		
		
		List<Integer> nuns = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		Integer ultimoNums1 = (Integer) ListaUtil.getUltimo1(nuns);
		System.out.println(ultimoNums1);
		
		Integer ultimoNums2 = ListaUtil.getUltimo2(nuns);		
		System.out.println(ultimoNums2);
		
		Integer ultimoNums3 = ListaUtil.<Integer>getUltimo2(nuns);		
		System.out.println(ultimoNums3);
		
		
		
	}

}
