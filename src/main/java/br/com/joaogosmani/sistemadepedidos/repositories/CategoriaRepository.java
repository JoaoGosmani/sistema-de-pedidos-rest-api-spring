package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{

}
