import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A;
        System.out.println("digite um numero para ele ter um reajuste");
        A = sc.nextInt();
        A = A + A*0.05;
        System.out.println("o numero com reajuste é"+ A);


    sc.close();}
}
