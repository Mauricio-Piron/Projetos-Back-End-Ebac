/**
 * 
 */
package br.com.mauriciopiron;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.mauriciopiron.dao.AcessorioDao;
import br.com.mauriciopiron.dao.IAcessorioDao;
import br.com.mauriciopiron.domain.Acessorio;

public class AcessorioTest {

	private IAcessorioDao acessorioDao;
	
	public AcessorioTest() {
		acessorioDao = new AcessorioDao();
	}

	@Test
	public void cadastrar() {
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigo("B1");
		acessorio.setDescricao("Carro Eletrico");
		acessorio.setNome("BMW EL2");
		acessorio = acessorioDao.cadastrar(acessorio);
		
		assertNotNull(acessorio);
		assertNotNull(acessorio.getId());
	}
}
