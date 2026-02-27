import java.util.Scanner;
import java.util.Random;

public class exe20 {
    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(100)+1;
        System.out.println("Número Aleatório:" + number);
    }
}
