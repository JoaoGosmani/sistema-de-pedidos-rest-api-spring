package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
