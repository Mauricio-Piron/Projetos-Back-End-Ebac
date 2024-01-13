package br.com.jmpiron;
/**
 * @author mauricio.piron
 */
public class VendaVeiculo {
    /**
     *
     * @param args valores do sistema     */

    public static void main(String args[]) {

        /*
         * Imprime na tela as informações do
         * Proprietário e do Veículo;
         */

        Proprietario proprietario = new Proprietario();
        proprietario.cadastratarProprietario("José Maurício");
        proprietario.cadastrarEndereco("Rua Java, n.1, Bairro: EBAC");
        proprietario.cadastrarCPF("066.953.496-06");

        Veiculo veiculo = new Veiculo();
        veiculo.cadastrarMarca("volkswagen");
        veiculo.cadastrarrModelo("FOX");

        System.out.println(proprietario.getNome());
        System.out.println(proprietario.getEndereco());
        System.out.println(proprietario.getCPF());

        System.out.println(veiculo.getMarca());
        System.out.println(veiculo.getModelo());
        System.out.println(proprietario.getProprietario());

    }

}
