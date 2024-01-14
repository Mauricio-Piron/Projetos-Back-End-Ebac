package br.com.mauriciopiron;

/**
 * @author mauricio.piron
 */
public class Media {

    public static void main(String[] args) {

    float nota1 = 7.0f;
    float nota2 = 9.5f;
    float nota3 = 6.2f;
    float nota4 = 7.5f;

    float resultado = (nota1 + nota2 + nota3 + nota4)/4;

    if (resultado >= 7)
    System.out.println("Aluno Aprovado " + "Nota: " + resultado + " Parabéns");
    else
        System.out.println("Aluno em recuperacão " + "Nota: " + resultado);

    }
}
