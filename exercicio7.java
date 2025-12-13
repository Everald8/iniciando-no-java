import java.util.Scanner;
public class exercicio7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        boolean A, B;
        System.out.println("digite um valor ( true ou false)");
        A = sc.nextBoolean();
        System.out.println("digite outro valor (true ou false)");
        B = sc.nextBoolean();
        if(A && B){
            System.out.println("ambos sao logicamente iguais");


        }else if(!A && !B){
            System.out.println("ambos sao logicamente falsos");
        }else{
            System.out.println("os valosres sao diferentes");
        }
    sc.close();}

}
