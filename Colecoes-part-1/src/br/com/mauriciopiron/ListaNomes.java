package br.com.mauriciopiron;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.Set;

public class ListaNomes {

    public static void main(String[] args) {

        exemploListaArray(); //Exemplo 1 -> utilizando ArrayList
        exemploTreeSet();
    }

    private static void exemploListaArray() {
        System.out.println("****** Lista de Nomes em Ordem Alfabética ******");

        List<String> listaNomes = new ArrayList<String>();
        listaNomes.add("José Maurício");
        listaNomes.add("Ana Beatriz");
        listaNomes.add("Ana Clara");
        listaNomes.add("Fernando");
        Collections.sort(listaNomes);
        System.out.println(listaNomes);

    }

    private  static void exemploTreeSet() {
        System.out.println("****** Exemplo Lista Nomes TreeSet ******");

        Set<String> listaNomes = new TreeSet<String>();
        listaNomes.add("José Maurício");
        listaNomes.add("Ana Beatriz");
        listaNomes.add("Ana Clara");
        listaNomes.add("Fernando");

        System.out.println(listaNomes);


    }

}
