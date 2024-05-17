package br.com.mauriciopiron.mock;

import br.com.mauriciopiron.domain.Cliente;
import br.com.mauriciopiron.dao.IClienteDAO;

import java.util.Collection;

public class ClienteDAOMock implements IClienteDAO {

    @Override
    public Boolean cadastrar(Cliente entity) {
        return true;
    }

    @Override
    public void excluir(Long valor) {

    }

    @Override
    public void alterar(Cliente entity) {

    }

    @Override
    public Cliente consultar(Long valor) {
        Cliente cliente = new Cliente();
        cliente.setCpf(valor);
        return cliente;
    }

    @Override
    public Collection<Cliente> buscarTodos() {
        return null;
    }
}
