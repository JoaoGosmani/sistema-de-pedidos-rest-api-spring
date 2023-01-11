package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.ItemPedido;
import br.com.joaogosmani.sistemadepedidos.domain.ItemPedidoPK;

public interface ItemPedidoRepository extends JpaRepository<ItemPedido, ItemPedidoPK>{

}
