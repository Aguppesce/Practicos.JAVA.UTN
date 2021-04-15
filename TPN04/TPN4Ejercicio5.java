package Trabajos_Practicos.TPN4;
import java.util.Scanner;

public class TPN4Ejercicio5 {
    public static void main(String[] args) {
        int num;
        Scanner teclado = new Scanner(System.in);
        System.out.printf("Ingrese un numero: ");
        num = teclado.nextInt();
        for (int i = 1; i < num; i++) {
            for (int j = 1; j < num - i; j++) {
                System.out.print(" ");
            }
            for (int a = 1; a <= (i * 2) - 1; a++) {
                System.out.print("*");
            }
            System.out.println();
        }
        teclado.close();
    }
}
