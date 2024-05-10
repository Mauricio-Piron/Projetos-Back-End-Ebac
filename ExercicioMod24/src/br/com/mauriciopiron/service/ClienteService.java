package br.com.mauriciopiron.service;

import br.com.mauriciopiron.cliente.dao.IClienteDao;
import br.com.mauriciopiron.cliente.dao.ClienteDao;

public class ClienteService {

    private IClienteDao clienteDao;

    public ClienteService(IClienteDao clienteDao) {
        //clienteDao = new ClienteDao();
        this.clienteDao = clienteDao;
    }

    public String salvar() {
        clienteDao.salvar();
        return "Sucesso";
    }

}



