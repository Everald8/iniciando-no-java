import Numero.Numero;

import java.util.Scanner;
public class exercicio15 {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        Numero n = new Numero();
        System.out.println("digite o dia que vc nasceu:");
        n.n = sc.nextInt();
        System.out.println("digite o mes que vc nasceu:");
        n.n1 = sc.nextInt();
        System.out.println("digite o ano que vc nasceu:");
        n.n2 = sc.nextInt();
        n.verificarData();

    sc.close();}
}


