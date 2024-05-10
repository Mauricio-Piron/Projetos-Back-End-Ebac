package br.com.mauriciopiron.service;

import br.com.mauriciopiron.cliente.dao.IContratoDao;

public class ContratoService implements IContratoService{

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Busca efetuada com sucesso";
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Exclusao efetuada com sucesso";
    }

    @Override
    public String altualizar() {
        contratoDao.atualizar();
        return "Contrato alterado com sucesso";
    }

}
