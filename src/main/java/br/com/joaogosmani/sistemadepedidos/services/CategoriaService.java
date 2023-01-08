package br.com.joaogosmani.sistemadepedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joaogosmani.sistemadepedidos.domain.Categoria;
import br.com.joaogosmani.sistemadepedidos.repositories.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repository;
	
	public Categoria findById(Integer id) {
		Optional<Categoria> categoria = repository.findById(id);
		return categoria.orElse(null);
	}
	
}
