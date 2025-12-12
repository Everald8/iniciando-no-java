import java.util.Scanner;

public class exercicio4 {
    public static void main( String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        System.out.print("digite um numero para ver seu antecessor e sucessor:");
        A = sc.nextInt();
        B = A - 1;
        C = A + 1;
        System.out.print("seu antecessor e sucessor é:"+ B +" e " + C);

        sc.close(); }

}