package scp.model.dao;

import java.util.List;

import scp.model.domain.Cliente;

public interface ClienteDao {

	List<Cliente> getClientes();

	Cliente salvar(Cliente Cliente);

	void excluir(Cliente Cliente);

	void atualizar(Cliente Cliente);

}