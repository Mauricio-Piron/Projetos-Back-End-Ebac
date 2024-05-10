import br.com.mauriciopiron.cliente.TestCliente;
import org.junit.Assert;
import org.junit.Test;

public class TestClienteTest {

    @Test
    public void testeClasseCliente() {
        TestCliente cli = new TestCliente();
        cli.adicionarNome("Michele");
        cli.adicionarNome1("Michele");

        Assert.assertEquals("Michele", cli.getNome());
    }
}
