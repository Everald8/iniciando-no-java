package Numero;

public class Numero {
    private int numero1; // variáveis privadas
    private int numero2;
    private int numero3;

    // Construtor
    public Numero(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.numero3 = 0;  // inicializa numero3
    }

    // Método para trocar os valores de numero1 e numero2
    public void modificaNumero() {
        numero3 = numero1;
        numero1 = numero2;
        numero2 = numero3;
        System.out.println("Os números trocados são: " + numero1 + " e " + numero2);
    }

    // Métodos getters e setters
    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }
}
