package br.com.mauriciopiron;

import java.util.Scanner;

public class MediaFinal {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        String resposta =  " ";
        do {

            System.out.println("Informe nome do Aluno");
            String nome = s.next();

            System.out.println("Informe valor da primeira nota");
            double nota1 = s.nextDouble();

            System.out.println("Informe valor da segunda nota");
            double nota2 = s.nextDouble();

            System.out.println("Informe valor da terceira nota");
            double nota3 = s.nextDouble();

            System.out.println("Informe valor da quarta nota");
            double nota4 = s.nextDouble();
            System.out.println(nota1 + nota2 + nota3 + nota4);
            double media = (nota1 + nota2 + nota3 + nota4) / 4;
            System.out.println(media);
            String mediaSt = getMedia(media);
            System.out.println(mediaSt);

        System.out.println("Deseja verificar a média de outro Aluno? - SIM ou NAO");
        resposta = s.next();
        }while (resposta.equalsIgnoreCase("Sim"));

        System.out.println("Programa encerrado com sucesso. ");
    }

    public static String getMedia(double media) {
        if (media >= 7) {
            return "Parabéns, aluno Aprovado.";
        } else if(media >= 5) {
            return  "Aluno em recuperaçao";
        } else {
           return "Aluno reprovado";
    }
  }
}
