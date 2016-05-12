package scp.model.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import scp.model.domain.Cliente;

public class ClienteDaoImpl implements ClienteDao {
	
	@PersistenceContext(unitName="SCPPU")
	private EntityManager entityManager;

	/* (non-Javadoc)
	 * @see scp.model.dao.ClienteDao#getClientes()
	 */
	@Override
	@SuppressWarnings("unchecked")
	public List<Cliente> getClientes() {
		javax.persistence.Query query = entityManager.createQuery("from Cliente");
		return query.getResultList();
	}

	/* (non-Javadoc)
	 * @see scp.model.dao.ClienteDao#salvar(scp.model.domain.Cliente)
	 */
	@Override
	public Cliente salvar(Cliente cliente) {
		entityManager.persist(cliente);
		return cliente;
	}

	/* (non-Javadoc)
	 * @see scp.model.dao.ClienteDao#excluir(scp.model.domain.Cliente)
	 */
	@Override
	public void excluir(Cliente cliente) {
		Cliente clienteMerge = entityManager.merge(cliente);
		entityManager.remove(clienteMerge);		
	}

	/* (non-Javadoc)
	 * @see scp.model.dao.ClienteDao#atualizar(scp.model.domain.Cliente)
	 */
	@Override
	public void atualizar(Cliente cliente) {
		Cliente clienteMerge = entityManager.merge(cliente);
		entityManager.persist(clienteMerge);			
	}

}
