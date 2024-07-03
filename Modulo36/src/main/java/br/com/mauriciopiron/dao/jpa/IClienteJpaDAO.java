/**
 * 
 */
package br.com.mauriciopiron.dao.jpa;

import br.com.mauriciopiron.dao.generic.jpa.IGenericJapDAO;
import br.com.mauriciopiron.domain.jpa.Persistente;

public interface IClienteJpaDAO<T extends Persistente> extends IGenericJapDAO<T, Long>{

}
