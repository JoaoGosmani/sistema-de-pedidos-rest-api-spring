package br.com.joaogosmani.sistemadepedidos.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.joaogosmani.sistemadepedidos.domain.Pedido;
import br.com.joaogosmani.sistemadepedidos.repositories.PedidoRepository;
import br.com.joaogosmani.sistemadepedidos.services.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {

	@Autowired
	private PedidoRepository repository;
	
	public Pedido findById(Integer id) {
		Optional<Pedido> pedido = repository.findById(id);
		return pedido.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
	}
	
}
