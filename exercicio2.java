import java.util.Scanner;
public class exercicio2 {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int A,res;
        System.out.print("digite um numero para ver se é par/impar,nagativo ou positivo:");
        A = sc.nextInt();
        if (A>0){
            System.out.print("seu numero é positivo");

        }else if (A==0){
            System.out.print("seu numero é zero");
        }else if (A<0){
            System.out.print("seu numero e negativo");
        }res = A%2;
        if (res== 0){
            System.out.println("  é  par");
        } else{
            System.out.print("  e é impar");

        }
    }

}
