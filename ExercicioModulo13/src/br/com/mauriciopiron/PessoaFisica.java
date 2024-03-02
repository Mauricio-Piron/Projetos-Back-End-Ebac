package br.com.mauriciopiron;
/**
 * @author mauriciopiron
 */
public class PessoaFisica extends Pessoa {

	private Long CPF;

    private String sobreNome;

    private Double salario;
    
    private Double despesas;
    
 
	public Long getCPF() {
		return CPF;
	}


	public void setCPF(Long cPF) {
		CPF = cPF;
	}


	public String getSobreNome() {
		return sobreNome;
	}


	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}


	public Double getSalario() {
		return salario;
	}




	public void setSalario(Double salario) {
		this.salario = salario;
	}
	
	
	

	public Double getDespesas() {
		return despesas;
	}


	public void setDespesas(Double despesas) {
		this.despesas = despesas;
	}


	@Override
	public Double renda() {
		// TODO Auto-generated method stub
		return salario - despesas;
	}




}
