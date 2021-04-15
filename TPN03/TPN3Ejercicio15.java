package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio15 {
    public static void main(String[] args) {
        int[] num = new int[10];
        int min;
        Scanner teclado = new Scanner(System.in);
        for(int i=0; i<num.length; i++) {
            System.out.print("Ingrese numero para la posición " + (i + 1) + ": ");
            num[i] = teclado.nextInt();
        }
        min=num[0];
        for(int i=0; i < num.length; i++){
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println("El minimo es: " + min);
    }
}

