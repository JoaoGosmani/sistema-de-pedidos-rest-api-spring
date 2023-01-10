package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.Pedido;

public interface PedidoRepository extends JpaRepository<Pedido, Integer> {

}
