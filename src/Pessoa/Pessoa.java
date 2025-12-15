package Pessoa;

public class Pessoa {
    public String nome;
    public int idade;
    public void verificarMaioridade(){
        if(idade>=18){
            System.out.println(nome + " e maior de idade!");
        }else{
            System.out.println(nome + " e menor de idade!");
        }
    }
}
