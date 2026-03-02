import java.util.Scanner;

public class exe23 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double horaTRA,numeAulas, desconto, salatotal = 0.0;
        System.out.println("qual o valor da hora trabalhada?: ");
        horaTRA = sc.nextDouble();
        System.out.println("qual o numero de aulas em um dia?: ");
        numeAulas = sc.nextDouble();
        numeAulas = numeAulas * 30;
        System.out.println("qual o valor do desconto em % do inss?: ");
        desconto = sc.nextDouble();
        salatotal = horaTRA * numeAulas - (desconto/100);
        System.out.println("o salario total e equivalente á " + salatotal);
    sc.close();}
}
