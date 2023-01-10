package br.com.joaogosmani.sistemadepedidos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.joaogosmani.sistemadepedidos.domain.Pagamento;

public interface PagamentoRepositoy extends JpaRepository<Pagamento, Integer> {

}
