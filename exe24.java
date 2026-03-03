import java.util.Scanner;
public class exe24 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double tempo,veloMedia, distancia = 0.0, litroGasto = 0;
        System.out.println("quanto tempo gastou na viagem?: ");
        tempo = sc.nextDouble();
        System.out.println("qual foi a velociade media?: ");
        veloMedia = sc.nextDouble();
        distancia = tempo * veloMedia;
        litroGasto = distancia/12;
        System.out.println("os litros gasto nessa viagem foi: " + litroGasto);
    sc.close();}
}
