import Pessoa.Pessoa;

import java.util.Scanner;

public class deMaior {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        System.out.println("digite seu nome: ");
        pessoa.nome = sc.nextLine();
        System.out.println("digite a idade: ");
        pessoa.idade = sc.nextInt();
        pessoa.verificarMaioridade();

    sc.close();}
}
