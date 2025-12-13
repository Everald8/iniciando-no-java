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
        if(IMC<=18.5){
            System.out.println("Abaixo do peso!");
        }else if(IMC >18.5 || IMC<=24.9 ){
            System.out.println("peso ideal (parabens)");
        }else if (IMC >25.0 || IMC<29.9){
            System.out.println("levemente acima do peso");
        }else if(IMC >30.0 || IMC<34.9){
            System.out.println("obesidade graus 1");
        }else if (IMC>35 || IMC<39.9){
            System.out.println("obesidade grau2");
        } else if (IMC>=40.0) {
            System.out.println("obesidade gurau 3 (morbida)");

        }
        sc.close();}
}