package br.com.mauriciopiron.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.mauriciopiron.domain.Acessorio;

public class AcessorioDao implements IAcessorioDao{
	
		@Override
		public Acessorio cadastrar(Acessorio acessorio) {
			
			EntityManagerFactory entityManagerFactory = 
					Persistence.createEntityManagerFactory("CarroJPA");
			EntityManager entityManager = entityManagerFactory.createEntityManager();
			
			entityManager.getTransaction().begin();
			entityManager.persist(acessorio);
			entityManager.getTransaction().commit();
			 
			entityManager.close();
			entityManagerFactory.close();
			
			
			return acessorio;
		}

}
