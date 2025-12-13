import java.util.Scanner;
public class exercicio8 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int A,B,C;
        System.out.println("ditige um valor para A:");
        A = sc.nextInt();
        System.out.println("digite um valor para B:");
        B= sc.nextInt();
        System.out.println("digite um valor para C");
        C = sc.nextInt();
        if(A>B && A<C){
            System.out.println("a ordem decrescente é: " + C +";"+ A +";"+ B);

        } else if (B>A && B<C){
            System.out.println("a ordem decrescente é: "+C +";"+ B +";"+ A);


        } else if (C>A && C<B) {
            System.out.println("a ordem decrescente é: " +B +";"+ C +";"+ A);
        }else if(C>B && C<A){
            System.out.println("a ordem decrescente é: " + A +";"+ C +";"+ B );
        }else if (B>C && B<A){
            System.out.println("a ordem decrescente é: " + A +";"+ B+";"+ C );
        }else if (A<B && A>C){
            System.out.println("a ordem decrescente é: " + B +";"+A +";"+C);

        }
        sc.close();}
}
