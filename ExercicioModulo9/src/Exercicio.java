/**
 * @author Mauricio.Piron
 */
import java.util.Scanner;

public class Exercicio {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int n;

        System.out.println("Digite a sua idade. ");
        n = ler.nextInt();
        Integer n2 = (Integer) n;
        System.out.println("Sua idade é de " + n2 + " anos.");
    }
}
