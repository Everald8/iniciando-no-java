package Numero;

public class Numero {
    public int n;
    public int n1;
    public int n2;
    private int n3;

    public void verificarData() {
        if (n >0 && n <30){
            n = -n +16+30;
            n1 = (-n1-1)+12 ;
            n2 = -n2 + 2025;
            System.out.println("vc tem a proximadamente "+ n2 + "anos" + n1 + "meses" + n + "dias");
        } else if (n == 30) {
            n = -n+16 + 30;
            n1 = -n1 + 12;
            n2 = -n2  + 2025;
            System.out.println("vc tem a proximadamente "+ n2 + "anos" + n1 + "meses" + n + "dias");
        }else {
            System.out.println("data incorreta!");
        }
    }

}
