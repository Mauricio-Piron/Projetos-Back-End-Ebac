package br.com.mauriciopiron.abstractfactory;

public class LuxuosoCar implements CarroLuxuoso{

	@Override
	public void exibirInfoLuxuoso() {
		System.out.println("Carro: Luxuoso");
		System.out.println("===============================");
		System.out.println("Motor Alta Performance");
		System.out.println("Interior: Confortável");
		System.out.println("Acessórios: Completo");
		System.out.println("Rodas: Rodas personalizadas");
		System.out.println("Preço: Alto");
	}

}
