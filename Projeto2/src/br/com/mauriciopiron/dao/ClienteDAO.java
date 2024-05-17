package br.com.mauriciopiron.dao;

import br.com.mauriciopiron.dao.generic.GenericDAO;
import br.com.mauriciopiron.domain.Cliente;

public class ClienteDAO extends GenericDAO <Cliente> implements IClienteDAO {

    public ClienteDAO(){
        super();
    }
    @Override
    public Class<Cliente> getClassType() {
        return Cliente.class;
    }

    @Override
    public void atualizarDados(Cliente entity, Cliente entityCadastrada) {

    }

    //aqui acontece a logica de funcionar todas as opções de funcionalidade do programa

}
