package br.com.mauriciopiron.abstractfactory;

public class EconomicoCar implements CarroEconomico{

	@Override
	public void exibirInfoEconomico() {
		System.out.println("Carro Economico");
		System.out.println("===============================");
		System.out.println("Motor básico");
		System.out.println("Interior: básico funcional");
		System.out.println("Acessórios: Mínimo necessário");
		System.out.println("Rodas: Rodas Padrão");
		System.out.println("Preço: Econômico");
		
	}

}
