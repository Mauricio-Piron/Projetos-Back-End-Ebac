package br.com.mauriciopiron;
/**
 * @author mauriciopiron
 */
public class PessoaJuridica extends Pessoa {

	   public Long CPNJ;

	    public String NomeFantasia;

	    private Double rendaBruta;
	    
	    private Double pagtofuncionario;

	    
	    
	public Long getCPNJ() {
			return CPNJ;
		}



		public void setCPNJ(Long cPNJ) {
			CPNJ = cPNJ;
		}



		public String getNomeFantasia() {
			return NomeFantasia;
		}



		public void setNomeFantasia(String nomeFantasia) {
			NomeFantasia = nomeFantasia;
		}



		public Double getRendaBruta() {
			return rendaBruta;
		}



		public void setRendaBruta(Double rendaBruta) {
			this.rendaBruta = rendaBruta;
		}

		

		public Double getPagtofuncionario() {
			return pagtofuncionario;
		}



		public void setPagtofuncionario(Double pagtofuncionario) {
			this.pagtofuncionario = pagtofuncionario;
		}



		@Override
		public Double renda() {
			// TODO Auto-generated method stub
			return rendaBruta - pagtofuncionario;
		}



}
