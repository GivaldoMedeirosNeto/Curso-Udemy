package exercicios.classes;

public class Usuario {

	String nome;
	String email;
	

	public boolean equals(Object obj) {
		
		if(obj != null) {
			
			if(obj instanceof Usuario) {
				
				Usuario usuario = (Usuario) obj;
				boolean nome = usuario.nome == this.nome;
				boolean email = usuario.email == this.email;
				//boolean email = usuario.email.equals(this.email); // Preferencial
				return nome && email;
				
			}
			
			return true;
		}
		
		return false;
		
	}
	
	public int hashCode() {
		return 0;
	}
	
}
