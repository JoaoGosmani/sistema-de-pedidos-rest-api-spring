package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer>{

}
