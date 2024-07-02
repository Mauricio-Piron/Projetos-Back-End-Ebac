package br.com.mauriciopiron.dao;


import br.com.mauriciopiron.dao.generic.GenericDAO;
import br.com.mauriciopiron.domain.jpa.Produto;

public class ProdutoDAO extends GenericDAO<Produto, Long> implements IProdutoDAO {

	public ProdutoDAO() {
		super(Produto.class);
	}

}