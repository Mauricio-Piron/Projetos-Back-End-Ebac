package br.com.mauriciopiron.Reflections;

import java.util.ArrayList;
import java.util.List;

@ITabaleAnotation(tabela = { "José","Maurício" })
public class TabelaAnotation {
	
	public static void main(String[] args) {

		Class clas = TabelaAnotation.class; //Pegando a classe do Tabela
		System.out.println(clas);
		
		TabelaAnotation tabela = new TabelaAnotation(); //Instanciando
		Class clas1 = tabela.getClass();               //Pegando a classe do Tabela
		System.out.println(clas1);
		
	     List<String> nomeTabela = new ArrayList<>();
		 nomeTabela.add("José");
		 nomeTabela.add("Maurício");
		 System.out.println(nomeTabela);
	} 
 }