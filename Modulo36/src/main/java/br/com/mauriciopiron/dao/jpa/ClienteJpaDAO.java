/**
 * 
 */
package br.com.mauriciopiron.dao.jpa;

import br.com.mauriciopiron.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.mauriciopiron.domain.jpa.ClienteJpa;


public class ClienteJpaDAO extends GenericJpaDB1DAO<ClienteJpa, Long> implements IClienteJpaDAO<ClienteJpa> {

	public ClienteJpaDAO() {
		super(ClienteJpa.class);
	}

}
