import java.util.Scanner;
public class exercicio12 {
    static Scanner sc = new Scanner(System.in);

    public static double valorProduto(double p) {
        System.out.print("informe o valor do produto: ");
        return sc.nextDouble();
    }

    public static int menu(int m) {
        System.out.print("1 - A vista em dinheiro ou pix, recebe 15% desconto.\n2 - Á vista no cartão de crédito, recebe 10% de desconto.\n3 - Parcelado no cartão em duas vezes,preço normal do produto sem juros.\n4 - Parcelado no cartão em três vezes ou mais,preço normal do produto mais juros de 10%.\n-->  ");
        return sc.nextInt();
    }

    public static double processo1(double p) {
        return p = p - p * 0.15;
    }

    public static double processo2(double p) {
        return p = p - p * 0.10;
    }

    public static double processo3(double p) {
        return p;
    }public static double processo4(double p){
        return p = p + p*0.10;
}public static void main(String[] args) {
        double produto = 0.0;
        int menu1 = 0;
        produto = valorProduto(produto);
        menu1 = menu(menu1);

        switch (menu1){
            case 1:
                produto = processo1(produto);
                System.out.println("o valor a ser pago é: "+ produto);
                break;
            case 2:
                produto = processo2(produto);
                System.out.println("o valor a ser pago é " + produto);
                break;
            case 3:
                produto = processo3(produto);
                System.out.println("terá que pagar o valor bruto: " + produto);
                break;
            case 4:
                produto = processo4(produto);
                System.out.println("o valor com juros é: "+ produto);
                break;

        }



    sc.close();}
}
