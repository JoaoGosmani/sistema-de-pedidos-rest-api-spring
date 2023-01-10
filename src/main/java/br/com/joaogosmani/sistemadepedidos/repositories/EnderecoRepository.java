package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
