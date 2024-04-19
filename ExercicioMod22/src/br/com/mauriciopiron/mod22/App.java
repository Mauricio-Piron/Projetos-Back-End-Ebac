package br.com.mauriciopiron.mod22;
/**
 * @author mauricio.piron
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;



public class App {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		String nomesLidos;
		String separador = "-,"; 
		List<Pessoa> lista = new  ArrayList<>();
		Pessoa pessoa;		
				
		System.out.println("Informe os nomes e sexo da Pessoa, "
				+ "separado o nome do sexo por hifen e as pessoas por virgula: (Exemplo: Mauricio-M, Aparecida-F)");
		nomesLidos = s.nextLine();
		
		String nomeGenero [] = nomesLidos.split("["+Pattern.quote(separador)+"]");
		
		for(int i =0; i<nomeGenero.length;i++) {
			pessoa = new Pessoa();
			pessoa.setNome(nomeGenero[i]);
			pessoa.setSexo(nomeGenero[i+1]);
			lista.add(pessoa);
			i++;
		}
			
		
		lista.stream()
		.filter
			(p -> p.getSexo().toUpperCase().equals("F"))
				.forEach(p -> System.out.println(p));
		

		s.close();

	}
}
