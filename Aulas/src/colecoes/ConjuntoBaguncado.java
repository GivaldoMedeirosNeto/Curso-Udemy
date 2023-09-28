package colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		conjunto.add(1.2);
		conjunto.add(true);
		conjunto.add("teste");
		conjunto.add(1);
		conjunto.add('x');
		
		System.out.println(conjunto.size());
		
		conjunto.add("teste");
		System.out.println(conjunto.size());
		
		System.out.println(conjunto.remove("teste"));
		
		System.out.println(conjunto.contains(1));
		
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
		
		
		
	}

}
