package br.com.mauriciopiron.abstractfactory;

public interface FabricaDeCarros {
	CarroEconomico criarCarroEconomico();
	CarroLuxuoso criarCarroLuxuoso();
}
