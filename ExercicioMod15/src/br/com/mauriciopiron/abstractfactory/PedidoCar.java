package br.com.mauriciopiron.abstractfactory;

public class PedidoCar {
	public static void main(String[] args) {
		FabricaDeCarros fabrica = new FabricaCar();
		CarroEconomico CarroEconomico = fabrica.criarCarroEconomico();
		CarroLuxuoso CarroLuxuoso = fabrica.criarCarroLuxuoso();
		CarroEconomico.exibirInfoEconomico();
		System.out.println();
		CarroLuxuoso.exibirInfoLuxuoso();
		System.out.println();
	}
}
