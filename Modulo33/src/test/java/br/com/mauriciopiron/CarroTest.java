/**
 * 
 */
package br.com.mauriciopiron;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.mauriciopiron.dao.CarroDao;
import br.com.mauriciopiron.dao.ICarroDao;
import br.com.mauriciopiron.domain.Carro;

public class CarroTest {

	private ICarroDao cursoDao;
	
	public CarroTest() {
		cursoDao = new CarroDao();
	}

	@Test
	public void cadastrar() {
		Carro carro = new Carro();
		carro.setCodigo("B1");
		carro.setNome("BMW");
		carro = cursoDao.cadastrar(carro);
		
		assertNotNull(carro);
		assertNotNull(carro.getId());
	}
}
