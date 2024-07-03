/**
 * 
 */
package br.com.mauriciopiron.dao.jpa;

import br.com.mauriciopiron.dao.generic.jpa.GenericJpaDB1DAO;
import br.com.mauriciopiron.domain.jpa.ProdutoJpa;

public class ProdutoJpaDAO extends GenericJpaDB1DAO<ProdutoJpa, Long> implements IProdutoJpaDAO {

	public ProdutoJpaDAO() {
		super(ProdutoJpa.class);
	}

}
