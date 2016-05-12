package scp.model.service;

import java.util.List;

import scp.model.domain.Cliente;

public interface ClienteService {

	List<Cliente> getClientes();

	Cliente salvar(Cliente cliente);

	void excluir(Cliente cliente);

	void atualizar(Cliente cliente);

}