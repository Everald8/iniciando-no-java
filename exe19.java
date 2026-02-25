import java.util.Scanner;
public class exe19 {
    public static int[] mult(int val) {
        int[] vett = new int[11];
        for(int i=0;i<=10;i++){
            vett[i]= val * i;

        }return vett;


    }public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int valor;
        int [] vetor;
        System.out.println("digite um numero para ver sua tabuada:");
        valor = sc.nextInt();
        vetor = mult (valor);
        for(int i = 0; i<=10; i++){
            System.out.println("a tabuada dese numero é " +valor+ "x" +i+ "=" + vetor[i] );
        }

    sc.close();}
}
