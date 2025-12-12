import java.util.Scanner;

public class exercicio5 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double A = 1293.20, B;
        System.out.println("digite o seu salario:");
        B = sc.nextInt();
        B = B / A;
        System.out.println("vc recebe mais ou menos "+B+" salários ");

    sc.close();}
}
