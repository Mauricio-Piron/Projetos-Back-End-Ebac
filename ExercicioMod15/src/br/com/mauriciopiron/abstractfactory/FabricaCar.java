package br.com.mauriciopiron.abstractfactory;

public class FabricaCar implements FabricaDeCarros {

	@Override
	public CarroEconomico criarCarroEconomico() {
		return new EconomicoCar();
	}

	@Override
	public CarroLuxuoso criarCarroLuxuoso() {
		return new LuxuosoCar();
	}
}
