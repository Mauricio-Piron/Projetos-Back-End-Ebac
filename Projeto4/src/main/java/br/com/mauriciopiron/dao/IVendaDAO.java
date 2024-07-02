package br.com.mauriciopiron.dao;

import br.com.mauriciopiron.dao.generic.IGenericDAO;
import br.com.mauriciopiron.domain.jpa.Venda;
import br.com.mauriciopiron.exception.DAOException;
import br.com.mauriciopiron.exception.TipoChaveNaoEncontradaException;

public interface IVendaDAO extends IGenericDAO<Venda, Long>{

	public void finalizarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;
	
	public void cancelarVenda(Venda venda) throws TipoChaveNaoEncontradaException, DAOException;

	public Venda consultarComCollection(Long id);
}
