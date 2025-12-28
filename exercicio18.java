import pessoa18.pessoa;

class Exercicio18 {
    public static void main(String[] args) {

        pessoa francisco = new pessoa(1.50, 0.02);
        pessoa sara = new pessoa(1.30, 0.03);

        int anos = 0;

        while (sara.altura <= francisco.altura) {
            francisco.crescer();
            sara.crescer();
            anos++;
        }

        System.out.println(
                "Levou aproximadamente " + anos +
                        " anos para que Sara ficasse mais alta que Francisco."
        );
    }
}
