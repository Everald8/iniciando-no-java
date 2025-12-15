import Numero.Numero;
import java.util.Scanner;

public class exercicio14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Leitura de números
        System.out.println("Digite o 1° número:");
        int numero1 = sc.nextInt();
        System.out.println("Digite o 2° número:");
        int numero2 = sc.nextInt();

        // Criando objetos de Numero
        Numero n1 = new Numero(numero1, numero2);

        // Chamando o método que troca os números
        n1.modificaNumero();

        sc.close();
    }
}
