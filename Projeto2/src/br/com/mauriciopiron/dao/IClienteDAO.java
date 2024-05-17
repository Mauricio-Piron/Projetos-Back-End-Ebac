package br.com.mauriciopiron.dao;

import br.com.mauriciopiron.dao.generic.IGenericDAO;
import br.com.mauriciopiron.domain.Cliente;

public interface IClienteDAO extends IGenericDAO<Cliente> {
    //usa os metodos do generic

//    public Boolean salvar(Cliente cliente);
//
//    public Cliente buscarPorCpf(Long cpf);
//
//    void excluir(Long cpf);
//
//    void alterar(Cliente cliente);
}
