package fundamentos.aulas;

public class Wrappers {
	public static void main(String[] args) {
		
		Byte b = 10;
		System.out.println(b.byteValue());
		
		Short s = 100;
		System.out.println(s.toString());
		
		Integer i = 1000;
		System.out.println(i * 3);
		
		Integer i2 = Integer.parseInt("10000");
		System.out.println(i2 + 10);
		
		Long l = 10000L;		
		System.out.println(l / 3);
		
		Float f = 123.10F;
		System.out.println(f);
		
		Double d = 1234.5678;
		System.out.println(d);
		
		Boolean bo = Boolean.parseBoolean("True");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#';
		System.out.println(c + "...");		
		
		
	}

}
