import java.util.Scanner;
public class exe19 {
    public static int[][] mult() {
        int[][] mat = new int [11][11];
        for (int i = 0; i <= 10; i++) {
            for (int y = 0; y <= 10; y++) {
                mat[i][y] = i * y;

            }
           }return mat;


        }public static void main(String[] args){
            Scanner sc = new Scanner(System.in);

            int[][] result;
            result = mult();
            for (int i = 0; i <= 10; i++) {
                for (int y = 0; y <= 10; y++) {
                    System.out.println(i + "X" + y + "=" + result[i][y]);
                }



            }
        sc.close();}
    }
