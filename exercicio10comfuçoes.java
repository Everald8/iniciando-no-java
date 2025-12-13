import java.util.Scanner;


public class exercicio10comfuçoes {
    static Scanner sc = new Scanner(System.in);
    public static double Preencher(){
        System.out.println("digite as notas:");
        return sc.nextDouble();
    }
    public static void main(String[] args){
        double A,B,C,media = 0.0;
       A=Preencher();
       B=Preencher();
       C=Preencher();
       media=(A+B+C)/3; /*3 e seria o numero de notas*/
        System.out.println("a media das notas sao:"+media);



   sc.close();}
}
