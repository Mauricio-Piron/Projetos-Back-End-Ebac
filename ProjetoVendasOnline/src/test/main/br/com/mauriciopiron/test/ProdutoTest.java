package br.com.mauriciopiron.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.util.List;

import org.junit.Test;

import br.com.mauriciopiron.dao.generic.jdbc.dao.IProdutoDAO;
import br.com.mauriciopiron.dao.generic.jdbc.dao.ProdutoDAO;
import br.com.nauriciopiron.domain.Produto;


public class ProdutoTest {


	@Test public void cadastrarTest() throws Exception { IProdutoDAO prod = new
			ProdutoDAO();


	Produto produto = new Produto(); produto.setNome("Computador");
	produto.setCodigo("01"); produto.setValor(5500.00);

	Integer qtd = prod.cadastrar(produto); assertTrue(qtd == 1); //CONSULTAR

	Produto produtoBD = prod.consultar(produto.getCodigo());
	assertNotNull(produtoBD); assertNotNull(produtoBD.getId());
	assertEquals(produto.getCodigo(), produtoBD.getCodigo());
	assertEquals(produto.getNome(), produtoBD.getNome());
	assertEquals(produto.getValor(), produtoBD.getValor());

	Integer qtdDel = prod.excluir(produtoBD); assertNotNull(qtdDel); }



	@Test public void atualizarTest() throws Exception { IProdutoDAO prod = new
			ProdutoDAO();

	Produto produto = new Produto(); produto.setCodigo("10");
	produto.setNome("Computador"); produto.setValor(5500.00); Integer countCad =
			prod.cadastrar(produto); assertTrue(countCad == 1);

			Produto produtoDB = prod.buscar("10"); assertNotNull(produtoDB);
			assertEquals(produto.getCodigo(), produtoDB.getCodigo());
			assertEquals(produto.getNome(), produtoDB.getNome());
			assertEquals(produtoDB.getValor(), produtoDB.getValor());


			produtoDB.setCodigo("20"); produtoDB.setNome("TV");
			//produtoDB.setValor(6000.00);

			Integer countUpdate = prod.atualizar(produtoDB); assertTrue(countUpdate ==
					1);

			Produto produtoDB1 = prod.buscar("10"); assertNull(produtoDB1);

			Produto produtoDB2 = prod.buscar("20"); assertNotNull(produtoDB2);
			assertEquals(produtoDB2.getId(), produtoDB.getId());
			assertEquals(produtoDB2.getNome(), produtoDB.getNome());
			assertEquals(produtoDB2.getCodigo(), produtoDB.getCodigo());
			assertEquals(produtoDB2.getValor(), produtoDB.getValor());

			Integer countDel = prod.excluir(produtoDB); assertTrue(countDel == 1);

			List<Produto> list = prod.buscarTodos(); for (Produto prd : list) {
				prod.excluir(prd); }

			list = prod.buscarTodos(); assertTrue(list.size() == 0); }



	@Test
	public void buscarTest() throws Exception {
		IProdutoDAO prod = new ProdutoDAO();
		Produto produto = new Produto();

		produto.setCodigo("10");
		produto.setNome("Computador");
		produto.setValor(5500.00);
		Integer countCad = prod.cadastrar(produto);
		assertTrue(countCad == 1);

		Produto clienteDB = prod.buscar("10");
		assertNotNull(clienteDB);
		assertEquals(produto.getCodigo(), clienteDB.getCodigo());
		assertEquals(produto.getNome(), clienteDB.getNome());
		assertEquals(produto.getValor(), clienteDB.getValor());

		Integer countDel = prod.excluir(clienteDB);
		assertTrue(countDel == 1);
	}

    
	@Test
	public void buscarTodosTest() throws Exception {
		IProdutoDAO prod = new ProdutoDAO();

		Produto c1 = new Produto();
		c1.setCodigo("10");
		c1.setNome("Computador");
		c1.setValor(5500.00);

		Produto c2 = new Produto();
		c2.setCodigo("20");
		c2.setNome("TV");
		c2.setValor(4000.00);

		Integer count1 = prod.cadastrar(c1);
		Integer count2 = prod.cadastrar(c2);
		assertTrue(count1 == 1 && count2 == 1);

		List<Produto> list = prod.buscarTodos();
		assertNotNull(list);
		assertEquals(2, list.size());

		Integer delCount = 0;
		for (Produto cliente : list) {
			prod.excluir(cliente);
			delCount++;
		}

		assertTrue(delCount == 2);
		list = prod.buscarTodos();
		assertEquals(0, list.size());

	}

}
