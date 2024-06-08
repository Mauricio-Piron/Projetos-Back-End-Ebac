package br.com.mauriciopiron.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.mauriciopiron.dao.generic.jdbc.dao.ClienteDAO;
import br.com.mauriciopiron.dao.generic.jdbc.dao.IClienteDAO;
import br.com.nauriciopiron.domain.Cliente;

public class ClienteTest {


	@Test public void cadastrarTest() throws Exception {
		IClienteDAO dao = new  ClienteDAO();


		Cliente cliente = new Cliente(); 
		cliente.setCodigo("01");
		cliente.setNome("Mauricio Piron");

		Integer qtd = dao.cadastrar(cliente); 
		assertTrue(qtd == 1);

		//CONSULTAR
		Cliente clienteBD = dao.consultar(cliente.getCodigo());
		assertNotNull(clienteBD); 
		assertNotNull(clienteBD.getId());
		assertEquals(cliente.getCodigo(), clienteBD.getCodigo());
		assertEquals(cliente.getNome(), clienteBD.getNome());

		//EXCLUSAO
		Integer qtdDel = dao.excluir(clienteBD); 
		assertNotNull(qtdDel); }

	//BUSCAR TODOS
	@Test public void buscarTodosTest() throws Exception { IClienteDAO dao = new
			ClienteDAO();

	Cliente c1 = new Cliente(); c1.setCodigo("10"); c1.setNome("Maurico Piron");

	Cliente c2 = new Cliente(); c2.setCodigo("20");
	c2.setNome("Aparecida Dufor");

	Integer count1 = dao.cadastrar(c1); Integer count2 = dao.cadastrar(c2);
	assertTrue(count1 == 1 && count2 == 1);

	List<Cliente> list = dao.buscarTodos(); assertNotNull(list); assertEquals(2,
			list.size());

	Integer delCount = 0; for (Cliente cliente : list) { dao.excluir(cliente);
	delCount++; }

	assertTrue(delCount == 2); list = dao.buscarTodos(); assertEquals(0,
			list.size()); }
	 

	//ATUALIZAR
	@Test
	public void atualizarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		
		Cliente cliente = new Cliente();
		
		cliente.setCodigo("10");
		cliente.setNome("Mauricio Piron");
		Integer countCad = dao.cadastrar(cliente);
		assertTrue(countCad == 1);
		
		Cliente clienteDB = dao.buscar("10");
		assertNotNull(clienteDB);
		assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
		assertEquals(cliente.getNome(), clienteDB.getNome());
		
		clienteDB.setCodigo("20");
		clienteDB.setNome("Outro nome");
		
		Integer countUpdate = dao.atualizar(clienteDB);
		assertTrue(countUpdate == 1);
		
		Cliente clienteDB1 = dao.buscar("10");
		assertNull(clienteDB1);
		
		Cliente clienteDB2 = dao.buscar("20");
		assertNotNull(clienteDB2);
		assertEquals(clienteDB2.getId(), clienteDB.getId());
		assertEquals(clienteDB2.getNome(), clienteDB.getNome());
		assertEquals(clienteDB2.getCodigo(), clienteDB.getCodigo());
		
		Integer countDel = dao.excluir(clienteDB);
		assertTrue(countDel == 1);
		
		List<Cliente> list = dao.buscarTodos();
		for (Cliente cli : list) {
			dao.excluir(cli);
		}
		
		list = dao.buscarTodos();
		assertTrue(list.size() == 0);
	}

	//BUSCAR
	@Test
	public void buscarTest() throws Exception {
		IClienteDAO dao = new ClienteDAO();
		Cliente cliente = new Cliente();

		cliente.setCodigo("10");
		cliente.setNome("Mauricio Piron");
		Integer countCad = dao.cadastrar(cliente);
		assertTrue(countCad == 1);

		Cliente clienteDB = dao.buscar("10");
		assertNotNull(clienteDB);
		assertEquals(cliente.getCodigo(), clienteDB.getCodigo());
		assertEquals(cliente.getNome(), clienteDB.getNome());

		Integer countDel = dao.excluir(clienteDB);
		assertTrue(countDel == 1);
	}
}