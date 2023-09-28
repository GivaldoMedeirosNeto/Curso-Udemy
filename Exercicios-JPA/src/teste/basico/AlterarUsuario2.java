package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario2 {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Exercicios-JPA");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		
		Usuario usuario = em.find(Usuario.class, 4L);
		em.detach(usuario);		
		
		System.out.println(usuario.getNome());
		usuario.setNome("Liliane Lima");
		
		em.merge(usuario);
		
		em.getTransaction().commit();
		
		System.out.println(usuario.getNome());
		
		em.close();
		emf.close();
	}

}
