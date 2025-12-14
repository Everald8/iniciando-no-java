import java.util.Scanner;
public class exercicio11comfunçao {
    static Scanner sc = new Scanner(System.in);

    public static String Nome() {
        System.out.println("qual seu nome: ");
        return sc.nextLine();
    }

    public static double nota() {
        System.out.println("nota: ");
        return sc.nextDouble();
    }

    public static double media(double M, double n1, double n2, double n3, double n4) {
        return M = (n1 + n2 + n3 + n4)/4;
    }public static double verificarNota(double m){
        if (m>=7){
            return 1;
        } else{
            return 0;
        }
    }public static void main(String[] args){
        String nome;
        double nota1,nota2,nota3,nota4,mediA = 0;
        nome = Nome();
        nota1 = nota();
        nota2 = nota();
        nota3 = nota();
        nota4 = nota();
        mediA = media(mediA,nota1,nota2,nota3,nota4);
        System.out.println("nome: "+ nome);
        System.out.println("Média "+ mediA);
        if (verificarNota(mediA) == 1){
            System.out.println("APROVADO!");
        }else if(verificarNota(mediA) == 0){
            System.out.println("REPROVADO!");
        }
   sc.close(); }
}
