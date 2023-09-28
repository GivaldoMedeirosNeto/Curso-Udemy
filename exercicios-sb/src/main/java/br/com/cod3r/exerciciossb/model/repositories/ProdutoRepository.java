package br.com.cod3r.exerciciossb.model.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import jakarta.validation.Valid;

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer>{

	
	
	void save(@Valid Produto produto);
	void deleteById(int id);

	Iterable<Produto> findAll();
	Iterable<Produto> findByNomeContainingIgnoreCase(String nome);
	
	@Query("SELECT p FROM Produto p WHERE p.nome LIKE %:nome%")
	Iterable<Produto> pesquisarProdutoNome(@Param("nome") String nome);
	
	/*
	 * findByNomeStarsWith
	 * findByNomeEndsWith
	 * 
	 * findByNomeNotContaining

	 */

	Optional<Produto> findById(int id);

}
