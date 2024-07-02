package br.com.mauriciopiron.dao;

import br.com.mauriciopiron.dao.generic.GenericDAO;
import br.com.mauriciopiron.domain.jpa.Cliente;

public class ClienteDAO extends GenericDAO<Cliente, Long> implements IClienteDAO {

	public ClienteDAO() {
		super(Cliente.class);
	}

}
