import java.util.Scanner;

public class exe22 {
    public static int preencher(Scanner sc){
        int X;
        X =  sc.nextInt();
        return X;

    }public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A, B, total = 0, resto = 0;
        System.out.println("digite um numero para corresponder A:");
        A = preencher(sc);
        System.out.println("digite um numero para corresponder B:");
        B = preencher(sc);
        total = A/B;
        resto = A % B;
        System.out.println("o quociente da divisao é " + total);
        System.out.println("o resto da divisao é " + resto);
    sc.close();}

}
