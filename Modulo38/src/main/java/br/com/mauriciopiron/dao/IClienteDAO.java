/**
 * 
 */
package br.com.mauriciopiron.dao;

import java.util.List;

import br.com.mauriciopiron.dao.generic.IGenericDAO;
import br.com.mauriciopiron.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente, Long>{

	List<Cliente> filtrarClientes(String query);

}
