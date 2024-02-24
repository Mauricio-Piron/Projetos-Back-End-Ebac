package br.com.mauriciopiron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificaSexo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos nomes desejar informar? ");

        int quantity = sc.nextInt();
        sc.nextLine();

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.print("Informe o " + (i+1) + "° nome: ");
            String name = sc.nextLine();
            System.out.print("Informe M - Masculino ou F - Feminino ");
            String gender = sc.nextLine();

            if ("F".equals(gender.toUpperCase())) mulheres.add(name);
            else if ("M".equals(gender.toUpperCase())) homens.add(name);
            else System.out.println("Não identifiquei o sexo informado, esta pessoa não será registrada");
        }

        System.out.println("Lista dos homens:");
        for (String male : homens) System.out.println(" - " + male);

        System.out.println("Lista das mulheres:");
        for (String female : mulheres) System.out.println(" - " + female);
        sc.close();
    }
}