import br.com.mauriciopiron.cliente.dao.ClienteDao;
import br.com.mauriciopiron.cliente.dao.ClienteDaoMock;
import br.com.mauriciopiron.service.ClienteService;
import org.junit.Assert;
import org.junit.Test;

public class ClienteServiceTest {

    @Test
    public void salvarTest() {
        ClienteDaoMock mockDao = new ClienteDaoMock();
        ClienteService service = new ClienteService(mockDao);
        String retorno = service.salvar();
        Assert.assertEquals("Sucesso", retorno);
    }

   @Test(expected = UnsupportedOperationException.class)
   public void esperadoErroNoSalvarTest() {
      ClienteDao mockDao = new ClienteDao();
      ClienteService service = new ClienteService(mockDao);
      String retorno = service.salvar();
      Assert.assertEquals("Sucesso", retorno);
    }
}
