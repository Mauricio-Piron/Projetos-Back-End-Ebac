package br.com.mauriciopiron.anotation;

import java.util.ArrayList;
import java.util.List;

@ITabaleAnotation(tabela = { "José","Maurício" })
public class TabelaAnotation {
	
	public static void main(String[] args) {

		 
	     List<String> nomeTabela = new ArrayList<>();
		 nomeTabela.add("José");
		 nomeTabela.add("Maurício");
		 System.out.println(nomeTabela);
	}
	 

 }



