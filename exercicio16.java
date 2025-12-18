import numero.numero;

import java.util.Scanner;

public class exercicio16 {
    public static int prencher(Scanner sc){

        System.out.println("digite um numero:");
        return sc.nextInt();
}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        numero n = new numero();

        n.n1 = prencher(sc);
        n.n2 = prencher(sc);
        n.n3 = prencher(sc);



        n.VeificarTriagulo();
    sc.close();}
}
