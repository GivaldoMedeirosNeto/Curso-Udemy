package exercicios.classes;

public class EqualsHascode {

	public static void main(String[] args) {
		
		Usuario u1 = new Usuario();
		u1.nome = "Givaldo Medeiros";
		u1.email = "givaldo@gmail.com";
		
		Usuario u2 = new Usuario();
		u2.nome = "Givaldo Medeiros";
		u2.email = "givaldo@gmail.com";
		
		Usuario u3 = new Usuario();
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u1.toString() == u2.toString());		
		System.out.println(u1.equals(u3));
		
	}
	
}
