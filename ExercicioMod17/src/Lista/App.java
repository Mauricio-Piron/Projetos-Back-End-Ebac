package Lista;

import java.util.ArrayList;
import java.util.List;

import Fiat.Argo;
import Fiat.Toro;
import Jeep.Compass;
import Jeep.Renegade;

public class App {
	
	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<>();
		
		carros.add(new Argo());
		carros.add(new Toro());
		
		carros.add(new Compass());
		carros.add(new Renegade());
		
		listarCarros(carros);
		System.out.println("--------------------------------------");
		imprimirGeneric(carros);
	}
	
	
		public static void listarCarros(List<Carro> carros ) {
			System.out.println("Imprimindo Lista de Carros");
	        System.out.println("--------------------------------------");
			for(Carro carro : carros) {
				System.out.println(carro.getMarca() + "-" + carro.getModelo());
				
			}
		}
		
		 public static void imprimirGeneric(List<?> lista){
		        System.out.println("Método para imprimir qualquer objeto");
		        System.out.println("--------------------------------------");
		        for(Object st : lista ){
		            System.out.println(st);
		        }
		    }
}
