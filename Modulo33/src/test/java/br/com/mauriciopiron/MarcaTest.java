/**
 * 
 */
package br.com.mauriciopiron;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.Test;

import br.com.mauriciopiron.dao.AcessorioDao;
import br.com.mauriciopiron.dao.CarroDao;
import br.com.mauriciopiron.dao.IAcessorioDao;
import br.com.mauriciopiron.dao.ICarroDao;
import br.com.mauriciopiron.dao.IMarcaDao;
import br.com.mauriciopiron.dao.MarcaDao;
import br.com.mauriciopiron.domain.Acessorio;
import br.com.mauriciopiron.domain.Carro;
import br.com.mauriciopiron.domain.Marca;
/**
 * @author mauricio.piron
 *
 */
public class MarcaTest {
	
	private IMarcaDao marcaDao;
	
	private ICarroDao carroDao;
	
	private IAcessorioDao acessorioDao;
	
	public MarcaTest() {
		marcaDao = new MarcaDao();	
		acessorioDao = new AcessorioDao();
		carroDao = new CarroDao();
	}

	@Test
	public void cadastrar() {
		Carro carro = criarCarro("B1");
		Acessorio acessorio = criarAcessorio("B1");
		
		Marca marca = new Marca();
		marca.setCodigo("B1");
		marca.setDataCadastro(Instant.now());
		marca.setStatus("Patio");
		marca.setValor(10.500d);
		marca.setAcessorio(acessorio);
		marca.setCarro(carro);
		
		carro.setMarca(marca);
		marca = marcaDao.cadastrar(marca);
		
		assertNotNull(marca);
		assertNotNull(marca.getId());
		
		
		Marca matBD = marcaDao.buscarPorCodigoAcessorio(marca.getCodigo());
		assertNotNull(matBD);
		assertEquals(marca.getId(), matBD.getId());
		
	}

	private Carro criarCarro(String codigo) {
		Carro carro = new Carro();
		carro.setCodigo(codigo);
		carro.setNome("BMW");
		return carroDao.cadastrar(carro);
	}
	
	private Acessorio criarAcessorio(String codigo) {
		Acessorio acessorio = new Acessorio();
		acessorio.setCodigo(codigo);
		acessorio.setDescricao("Acessorio Teste");
		acessorio.setNome("Curso de Java Backend");
		return acessorioDao.cadastrar(acessorio);
	}
}
