package Trabajos_Practicos.TPN6;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TPN6Ejercicio5 {
    public static void main(String[] args) {
        int[][] mat = new int[4][6];
        int[] vec = new int[4];
        int numran;
        int numusua;
        Random r = new Random();
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 6; j++) {
                numran = r.nextInt(3) + 1;
                mat[i][j] = numran;
                System.out.printf(" " + mat[i][j]);
            }
            System.out.println();
        }
        for (int a = 0; a < 4; a++) {
            System.out.printf("Ingrese numero " + (a + 1) + "-> ");
            numusua = teclado.nextInt();
            vec[a] = numusua;
        }
        if ((vec.length == mat[0].length)) {
            System.out.println("El vector se encuentra en una de las columnas");
        } else {
            System.out.println("El vector no se encuentra en ninguna de las columnas");
        }
    }
}
