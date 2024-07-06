/**
 * 
 */
package br.com.mauriciopiron.service;

import java.util.List;

import br.com.mauriciopiron.domain.Cliente;
import br.com.mauriciopiron.exceptions.DAOException;
import br.com.mauriciopiron.services.generic.IGenericService;

public interface IClienteService extends IGenericService<Cliente, Long> {

	Cliente buscarPorCPF(Long cpf) throws DAOException;

	List<Cliente> filtrarClientes(String query);

}
