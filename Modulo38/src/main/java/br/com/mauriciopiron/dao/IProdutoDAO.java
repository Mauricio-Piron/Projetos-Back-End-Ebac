/**
 * 
 */
package br.com.mauriciopiron.dao;

import java.util.List;

import br.com.mauriciopiron.dao.generic.IGenericDAO;
import br.com.mauriciopiron.domain.Produto;

public interface IProdutoDAO extends IGenericDAO<Produto, String>{

	List<Produto> filtrarProdutos(String query);

}
