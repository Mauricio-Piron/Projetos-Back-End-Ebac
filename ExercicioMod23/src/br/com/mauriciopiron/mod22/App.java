package br.com.mauriciopiron.mod22;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

import static java.util.stream.Collectors.toList;

public class App {

    private static List<Pessoa> listagem = new ArrayList<>();
    public static void main(String[] args) {
        System.out.println("Listagem de pessoa por sexo masculino ou feminino usando Stream");

        String opcao = JOptionPane.showInputDialog(null,
                "Digite nome e genêro da seguinte forma: nome-m, ou f, de todas as pessoas que deseja cadastrar",
                "Digite seu nome e genêro", JOptionPane.INFORMATION_MESSAGE);

        validar(opcao);

        System.out.println("---Listagem de nomes---");
        listagem.forEach(System.out::println);

        System.out.println("---Listagem de nomes masculinos---");
        getListM().forEach(i->System.out.println(i));

        System.out.println("---Listagem de nomes femininos---");
        getListF().forEach(i->System.out.println(i));

    }

    public static List<Pessoa> getListF (){
        return listagem.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("f"))
                .collect(toList());
    }

    public static List<Pessoa> getListM (){
        return listagem.stream()
                .filter(pessoa -> pessoa.getGenero().equalsIgnoreCase("m"))
                .collect(toList());
    }

    private static void validar(String dados) {
        String [] separaDados = dados.split(",");

        for (String dado : separaDados) {
            String [] nomeGenero = dado.split("-");
            listagem.add(new Pessoa(nomeGenero[0],nomeGenero[1]));
        };

        JOptionPane.showMessageDialog(null,
                "Pessoas cadastradas com sucesso!",
                "Cadastro", JOptionPane.INFORMATION_MESSAGE);
    }
}
