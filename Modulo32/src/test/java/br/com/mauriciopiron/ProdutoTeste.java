package br.com.mauriciopiron;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

import br.com.mauriciopiron.dao.ProdutoDao;
import br.com.mauriciopiron.dao.IProdutoDao;
import br.com.mauriciopiron.domain.Produto;



public class ProdutoTeste {
	
	private IProdutoDao produtoDao;
	
	public ProdutoTeste() {
		produtoDao = new ProdutoDao();
	}
	
	@Test
	public void cadastrar() {
		Produto produto = new Produto();
		produto.setCodigo("A1");
		produto.setNome("Curso de Java Backend");
		produto.setValor(1200d);
		produto = produtoDao.cadastrar(produto);
		
		assertNotNull(produto);
		assertNotNull(produto.getId());
	}

}
