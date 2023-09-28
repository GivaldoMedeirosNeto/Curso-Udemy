package br.com.cod3r.exerciciossb.controllers;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cod3r.exerciciossb.model.entities.Produto;
import br.com.cod3r.exerciciossb.model.repositories.ProdutoRepository;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto salvarProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	
	@GetMapping
	public Iterable<Produto> obterProduto() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path = "/nome/{nome}")
	public Iterable<Produto> obterProdutoNome(@PathVariable String nome) {
		//return produtoRepository.findByNomeContainingIgnoreCase(nome);
		return produtoRepository.pesquisarProdutoNome(nome);
	}
	
	@GetMapping(path = "/{id}")
	public Optional<Produto> obterProdutoID(@PathVariable int id) {
		return produtoRepository.findById(id);
	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirPorduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
	
	@GetMapping(path = "/pagina/{numero}")
	public Iterable<Produto> obterProdutoPag(@PathVariable int numero){
		Pageable page = PageRequest.of(numero, 3);
		return produtoRepository.findAll(page);
	}
	
	/*
	 * Inserção em metodo separado
	@PostMapping
	public @ResponseBody Produto newProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}
	 
	 * alteração em metodo separado
	@PutMapping
	public Produto alterProduto(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;
	}*/

}
