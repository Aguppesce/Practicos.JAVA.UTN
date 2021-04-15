package Trabajos_Practicos.TPN6;
import java.util.Arrays;
import java.util.Random;

public class TPN6Ejercicio8 {
    public static void main(String[] args) {
        int[][] mat = new int[10][10];
        int impar = 0;
        int num;
        int i = 0, j = 0;
        Random ranm = new Random();
        for (i = 0; i < 10; i++) {
            for (j = 0; j < 10; j++) {
                num = ranm.nextInt(9) + 1;
                mat[i][j] = num;
                if (mat[i][j] % 2 == 1) {
                    impar = mat[i][j];
                    System.out.printf(" " + impar);
                }
            }
            System.out.println();
        }
    }
}
