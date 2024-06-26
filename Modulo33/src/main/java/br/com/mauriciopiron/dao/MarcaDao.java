package br.com.mauriciopiron.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.mauriciopiron.domain.Marca;

/**
 * @author mauricio.piron
 *
 */
public class MarcaDao implements IMarcaDao {
	
	@Override
	public Marca cadastrar(Marca marca) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("CarroJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		entityManager.getTransaction().begin();
		entityManager.persist(marca);
		entityManager.getTransaction().commit();
		 
		entityManager.close();
		entityManagerFactory.close();
		return marca;
	}

	@Override
	public Marca buscarPorCodigoAcessorio(String codigoAcessorio) {
		EntityManagerFactory entityManagerFactory = 
				Persistence.createEntityManagerFactory("CarroJPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT m FROM Marca m ");
		sb.append("INNER JOIN Acessorio c on c = m.acessorio ");
		sb.append("WHERE c.codigo = :codigoAcessorio");
		
		entityManager.getTransaction().begin();
		TypedQuery<Marca> query = 
				entityManager.createQuery(sb.toString(), Marca.class);
		query.setParameter("codigoAcessorio", codigoAcessorio);
		Marca marca = query.getSingleResult();    
		
		entityManager.close();
		entityManagerFactory.close();
		
		return marca;
	}
}
