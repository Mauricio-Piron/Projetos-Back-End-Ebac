package br.com.mauriciopiron.service;

import br.com.mauriciopiron.domain.Cliente;
import br.com.mauriciopiron.exception.TipoChaveNaoEncontradaException;

public interface IClienteService {
    public Boolean salvar(Cliente cliente) throws TipoChaveNaoEncontradaException;

    public Cliente buscarPorCpf(Long cpf);

    void excluir(Long cpf);

    void alterar(Cliente cliente) throws TipoChaveNaoEncontradaException ;
}
