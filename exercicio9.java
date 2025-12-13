import java.util.Scanner;

public class exercicio9 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double altura,peso,IMC = 0.0;
        System.out.println("digite sua altura:");
        altura = sc.nextDouble();
        System.out.println("digite seu peso:");
        peso = sc.nextDouble();
        IMC = peso / Math.pow(altura,2);
        System.out.println("seu IMC e: "+IMC);
   sc.close();}
}
