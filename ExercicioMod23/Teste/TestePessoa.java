import br.com.mauriciopiron.mod22.App;
import br.com.mauriciopiron.mod22.Pessoa;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestePessoa {

        @Test
        public void TestFList(){

            App.getListF().add(new Pessoa("nome","f"));

            assertTrue(App.getListF().stream()
                    .allMatch(pessoa-> pessoa.getGenero().equals("f")));
        }
    }