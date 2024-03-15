package dao;
/**
 * @author mauriciopiron
 */
import java.util.Collection;

import java.util.Map;
import java.util.TreeMap;

import domain.Cliente;

public class ClienteMapDAO implements IClienteDAO {

	private Map<Long, Cliente> map;
	
	public ClienteMapDAO() {
		this.map = new TreeMap<>(); /* instanciando meu map */
	}
	
	@Override
	public Boolean cadastrar(Cliente cliente) {
		if(this.map.containsKey(cliente.getCpf())) {
			return false;
		}
		this.map.put(cliente.getCpf(), cliente);
		return true;
	}

	@Override
	public void excluir(Long cpf) {
		Cliente clienteCadastrado = this.map.get(cpf);
		
		if (clienteCadastrado != null) { //cliente que esta na tela
			this.map.remove(clienteCadastrado.getCpf(), clienteCadastrado); // cliente do map
			
			}
		
	}

	@Override
	public void alterar(Cliente cliente) {
		Cliente clienteCadastrado = this.map.get(cliente.getCpf());
		
		if(clienteCadastrado != null) {
			clienteCadastrado.setNome(cliente.getNome());
			clienteCadastrado.setTel(cliente.getTel());
			clienteCadastrado.setNumero(cliente.getNumero());
			clienteCadastrado.setEnd(cliente.getEnd());
			clienteCadastrado.setCidade(cliente.getCidade());
			clienteCadastrado.setEstado(cliente.getEstado());
			
			
	}
	}
	@Override
	public Cliente consultar(Long cpf) {
		return this.map.get(cpf);
	}

	@Override
	public Collection<Cliente> buscarTodos() {
		return this.map.values();
	}

} 
