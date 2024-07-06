/**
 * 
 */
package br.com.mauriciopiron.service;

import java.util.List;

import br.com.mauriciopiron.domain.Produto;
import br.com.mauriciopiron.services.generic.IGenericService;

public interface IProdutoService extends IGenericService<Produto, String> {

	List<Produto> filtrarProdutos(String query);

}
