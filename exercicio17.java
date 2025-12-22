import temp.temperatura;

import java.util.Scanner;

public class exercicio17 {
    public static double fahrenheit(Scanner sc){
        System.out.println("digite a temperatura em fahrenheit: ");
        return sc.nextDouble();

    }public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        temperatura celsius = new temperatura();
        celsius.c1 = fahrenheit(sc);
        celsius.celsius();
    sc.close();}
}
