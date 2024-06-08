package br.com.mauriciopiron.dao.generic.jdbc.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.com.mauriciopiron.dao.generic.jdbc.ConnectionFactory;
import br.com.nauriciopiron.domain.Produto;


public class ProdutoDAO implements IProdutoDAO {

	
	@Override
	public Integer cadastrar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlInsert();
			stm = connection.prepareStatement(sql);
			adicionarParametrosInsert(stm, produto);
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
}
	
	//CONSULTAR
	@Override
	public Produto consultar(String codigo) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
    	Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlConsultar();
			stm = connection.prepareStatement(sql);
			adicionarParametrosSelect(stm, codigo);
			rs = stm.executeQuery();
			
		    if (rs.next()) {
		    	produto = new Produto();
		    	produto.setId(rs.getLong("id"));
		    	produto.setCodigo(rs.getString("codigo"));
		    	produto.setNome(rs.getString("NOME"));
		    	produto.setValor(rs.getDouble("VALOR"));
		    
		    }
			return produto;
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
	
	//BUSCAR
	@Override
	public Produto buscar(String codigo) throws Exception {
		Connection connection = null;
	    PreparedStatement stm = null;
	    ResultSet rs = null;
	    Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlConsultar();
			stm = connection.prepareStatement(sql);
			adicionarParametrosSelect(stm, codigo);
			rs = stm.executeQuery();
				
			   if (rs.next()) {
			    produto = new Produto();
			    Long id = rs.getLong("ID");
			    String nome = rs.getString("NOME");
			    String cd = rs.getString("CODIGO");
			    Double vr = rs.getDouble("VALOR");
			    produto.setId(id);
			    produto.setNome(nome);
			    produto.setCodigo(cd);
			    produto.setValor(vr);
			   }
			   return produto;
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
					stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
	
	//EXCLUIR
	@Override
	public Integer excluir(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlDelete();
			stm = connection.prepareStatement(sql);
			adicionarParametrosDelete(stm, produto);
			return stm.executeUpdate();
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		
	}
	
	
	//ATUALIZAR
	@Override
	public Integer atualizar(Produto produto) throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSqlUpdate();
			stm = connection.prepareStatement(sql);
			adicionarParametrosUpdate(stm, produto);
			return stm.executeUpdate();
		} catch(Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
	}
	
	//BUSCAR TODOS
	@Override
	public List<Produto> buscarTodos() throws Exception {
		Connection connection = null;
		PreparedStatement stm = null;
		ResultSet rs = null;
		List<Produto> list = new ArrayList<>();
		Produto produto = null;
		try {
			connection = ConnectionFactory.getConnection();
			String sql = getSelectAll();
			stm = connection.prepareStatement(sql);
			rs = stm.executeQuery();
			
			while (rs.next()) {
				produto = new Produto();
				Long id = rs.getLong("ID");
				String nome = rs.getString("NOME");
				String cod = rs.getString("CODIGO");
				Double vr = rs.getDouble("VALOR");
				produto.setId(id);
				produto.setNome(nome);
				produto.setCodigo(cod);
				produto.setValor(vr);
				list.add(produto);
			}
			return list;
		} catch (Exception e) {
			throw e;
		} finally {
			if (stm != null && !stm.isClosed()) {
				stm.close();
			}
			if (connection != null && !connection.isClosed()) {
				connection.close();
			}
		}
		
	}
	//INSERT
	
	private String getSqlInsert() {
		StringBuilder sb = new StringBuilder();
		sb.append("INSERT INTO TB_PRODUTO_2 (ID, NOME, CODIGO, VALOR) ");
		sb.append("VALUES (nextval('SQ_PRODUTO_2'),?,?,?)");
		return sb.toString();
	}

	private void adicionarParametrosInsert(PreparedStatement stm, Produto produto) throws SQLException {		
		stm.setString(1, produto.getNome());
		stm.setString(2, produto.getCodigo());
		stm.setDouble(3, produto.getValor());
	}

	
	//CONSULTAR
	private void adicionarParametrosSelect(PreparedStatement stm, String codigo) throws SQLException {
		stm.setString(1, codigo);
	}
		
		
	private String getSqlConsultar() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_PRODUTO_2 ");
		sb.append("WHERE CODIGO = ?");
		return sb.toString();
	}
		
	//EXCLUIR
	private String getSqlDelete() {
		StringBuilder sb = new StringBuilder();
		sb.append("DELETE FROM TB_PRODUTO_2 ");
		sb.append("WHERE CODIGO = ?");
		return sb.toString();
	}
		
	private void adicionarParametrosDelete(PreparedStatement stm, Produto produto) throws SQLException {
		stm.setString(1, produto.getCodigo());
	}

	//ATUALIZAR
	private String getSqlUpdate() {
		StringBuilder sb = new StringBuilder();
		sb.append("UPDATE TB_PRODUTO_2 ");
		sb.append("SET NOME = ?, CODIGO = ? ");
		sb.append("WHERE ID = ?");
		return sb.toString();
	}
		
	private void adicionarParametrosUpdate(PreparedStatement stm, Produto produto) throws SQLException {
		stm.setString(1, produto.getNome());
		stm.setString(2, produto.getCodigo());
		stm.setLong(3, produto.getId());
		//stm.setDouble(4, produto.getValor());
	}

	//BUSCAR
	private String getSelectAll() {
		StringBuilder sb = new StringBuilder();
		sb.append("SELECT * FROM TB_PRODUTO_2");
		return sb.toString();
	}
}

