package br.com.mauriciopiron;

import br.com.mauriciopiron.dao.IClienteDAO;
import br.com.mauriciopiron.domain.Cliente;
import br.com.mauriciopiron.exception.TipoChaveNaoEncontradaException;
import br.com.mauriciopiron.mock.ClienteDAOMock;
import br.com.mauriciopiron.service.ClienteService;
import br.com.mauriciopiron.service.IClienteService;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ClienteServiceTest {
    private IClienteService clienteService;
    private Cliente cliente;

    public ClienteServiceTest(){
        IClienteDAO dao = new ClienteDAOMock();
        clienteService = new ClienteService(dao);
    }

    @Before
    public void init(){
        cliente = new Cliente();
        cliente.setCpf(1123456789L);
        cliente.setNome("matheus");
        cliente.setCidade("rc");
        cliente.setEstado("sp");
        cliente.setEnd("end");
        cliente.setNumero(10);
        cliente.setTel(123415252L);
    }

    @Test
    public void pesquisarCliente(){
        Cliente clienteConsultado = clienteService.buscarPorCpf(cliente.getCpf());
        Assert.assertNotNull(clienteConsultado);
    }

    @Test
    public void salvarCliente() throws TipoChaveNaoEncontradaException {
        Boolean retorno = clienteService.salvar(cliente);
        Assert.assertTrue(retorno);
    }

    @Test
    public void excluirCliente(){
        clienteService.excluir(cliente.getCpf());
    }

    @Test
    public void alterarCliente() throws TipoChaveNaoEncontradaException {
        cliente.setNome("matheus merlo");
        clienteService.alterar(cliente);

        Assert.assertEquals("matheus merlo", cliente.getNome());
    }
}
