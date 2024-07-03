/**
 * 
 */
package br.com.mauriciopiron.dao.jpa;

import br.com.mauriciopiron.dao.generic.jpa.GenericJpaDB2DAO;
import br.com.mauriciopiron.domain.jpa.ClienteJpa;

public class ClienteJpaDB2DAO extends GenericJpaDB2DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDB2DAO() {
		super(ClienteJpa.class);
	}

}
