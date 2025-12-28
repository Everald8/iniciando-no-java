package pessoa18;

public class pessoa {
    public double altura;
    double crescimentoAnual;

    public pessoa(double altura, double crescimentoAnual) {
        this.altura = altura;
        this.crescimentoAnual = crescimentoAnual;
    }

    public void crescer() {
        altura += crescimentoAnual;
    }
}
