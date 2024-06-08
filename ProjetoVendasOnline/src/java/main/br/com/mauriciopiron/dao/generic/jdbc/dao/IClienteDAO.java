package br.com.mauriciopiron.dao.generic.jdbc.dao;


import java.util.List;

import br.com.nauriciopiron.domain.Cliente;


public interface IClienteDAO {

	public Integer cadastrar(Cliente cliente) throws Exception;
	
	public Cliente consultar(String codigo) throws Exception;

	public Integer excluir(Cliente clienteBD) throws Exception;

	public List<Cliente> buscarTodos() throws Exception;

	public Integer atualizar(Cliente clienteDB) throws Exception;

	public Cliente buscar(String string) throws Exception;
	
	
	
}
