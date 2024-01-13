package br.com.jmpiron;

/**
 * @author mauricio.piron
 */
public class Proprietario {

        private String nome;

        private String CPF;

        private String endereco;

    public String getNome() {
        return nome;
    }

    /**
     * Seta o nome
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastratarProprietario(String nome) {
        setNome(nome);
    }

    /**
     *
     * Você pode <b>também</b> incluir uma <i>Lista</i>:
     * <ol>
     *     <li>Prenome</li>
     *     <li>Nome</li>
     *     <li>Sobrenome</li>
     * </ol>
     * e hiperlinks: {@link br.com.jmpiron.Proprietario#cadastratarProprietario(String)}
     */
    public String getProprietario() {
        return nome;
    }

    /**
     *
     * @param endereco, rua, número, bairro
     */
    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }


    /**
     * Seta o CPF
     * @param CPF
     */
    public void cadastrarCPF(String CPF){
        setCPF(CPF);
    }


}


