package br.com.mauriciopiron;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ClassificaSexo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Quantos nomes desejar informar? ");

        int count = sc.nextInt();
        sc.nextLine();

        List<String> homens = new ArrayList<>();
        List<String> mulheres = new ArrayList<>();

        for (int i = 0; i < count; i++) {
            System.out.print("Informe o " + (i+1) + "° nome: ");
            String name = sc.nextLine();
            System.out.print("Informe M - Masculino ou F - Feminino ");
            String sexo = sc.nextLine();

            if ("F".equals(sexo.toUpperCase())) mulheres.add(name);
            else if ("M".equals(sexo.toUpperCase())) homens.add(name);
            else System.out.println("Não identifiquei o sexo informado, esta pessoa não será registrada");
        }

        System.out.println("Lista dos homens:");
        System.out.println(" - " + homens);

        System.out.println("Lista das mulheres:");
        System.out.println(" - " + mulheres);

        sc.close();
    }
}