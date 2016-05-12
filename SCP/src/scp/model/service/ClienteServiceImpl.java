package scp.model.service;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import scp.model.dao.ClienteDao;
import scp.model.domain.Cliente;

public class ClienteServiceImpl implements ClienteService {
	
	@Inject
	private ClienteDao clienteDao;

	/* (non-Javadoc)
	 * @see scp.model.service.ClienteService#getClientes()
	 */
	@Override
	public List<Cliente> getClientes() {
		return clienteDao.getClientes();
	}

	/* (non-Javadoc)
	 * @see scp.model.service.ClienteService#salvar(scp.model.domain.Cliente)
	 */
	@Override
	@Transactional
	public Cliente salvar(Cliente cliente) {
		return clienteDao.salvar(cliente);
	}

	/* (non-Javadoc)
	 * @see scp.model.service.ClienteService#excluir(scp.model.domain.Cliente)
	 */
	@Override
	@Transactional
	public void excluir(Cliente cliente) {
		clienteDao.excluir(cliente);
	}

	/* (non-Javadoc)
	 * @see scp.model.service.ClienteService#atualizar(scp.model.domain.Cliente)
	 */
	@Override
	@Transactional
	public void atualizar(Cliente cliente) {
		clienteDao.atualizar(cliente);		
	}

}
