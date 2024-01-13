package br.com.jmpiron;
/**
 * @author mauricio.piron
 */
public class Veiculo {

    public String modelo;

    public String marca;

    //private String proprietario;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    /*
     * Método para cadastrar Modelo do Véiculo
     */
    public void cadastrarrModelo(String modelo) {
        setModelo(modelo);
    }

    /*
    * Método para cadastrar Marca do Véiculo
    */

    public void cadastrarMarca(String marca) {
        setMarca(marca);
    }

}
