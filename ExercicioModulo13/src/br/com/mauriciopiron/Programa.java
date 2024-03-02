package br.com.mauriciopiron;
/**
 * @author mauriciopiron
 */
public class Programa {
	public static void main(String[] args) {
		
		PessoaFisica pessoaFisica = new PessoaFisica();
        pessoaFisica.setNome("José Maurício");
        pessoaFisica.setSobreNome("Piron");
        pessoaFisica.setCPF(11111111111L);
        pessoaFisica.setSalario(1000d);
        pessoaFisica.setDespesas(600d);
        System.out.println(pessoaFisica.getNome() + " " + pessoaFisica.getSobreNome()+ " " +
        		"inscrito no CPF: "+ pessoaFisica.getCPF() + " recebe de salario " +
        		pessoaFisica.getSalario() + " " + "após pagar suas despesas no valor de:  " +
        	    pessoaFisica.getDespesas() + " " + "tem ao final do mês o valor de: " + 
        		pessoaFisica.renda());
        		;
        imprimir(pessoaFisica);
	
	
	
		PessoaJuridica pessoaJuridica = new PessoaJuridica();
		pessoaJuridica.setNome("MauricioVendas");
		pessoaJuridica.setNomeFantasia("MP-LTDA");
		pessoaJuridica.setCPNJ(11111111000111L);
		pessoaJuridica.setRendaBruta(5000d);
		pessoaJuridica.setPagtofuncionario(4000d);
		
		System.out.println(pessoaJuridica.getNome() + " "  + pessoaJuridica.getNomeFantasia() + " " + "inscrita no CNPJ: " + 
				pessoaJuridica.getCPNJ() + " " + "lucro de: " + pessoaJuridica.getRendaBruta() + " tem um gasto mensal com funcionário de: " +
				pessoaJuridica.getPagtofuncionario() + " " +  "com lucro ao final do mês de: "  + pessoaJuridica.renda());
        		
        imprimir(pessoaJuridica);
		
	}
	public static void imprimir(Pessoa pessoa) {
		System.out.println(pessoa.getNome() + " Tem de renda ao final do mês o valor de: " + pessoa.renda());
	}
}

