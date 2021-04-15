package Trabajos_Practicos.TPN6;
import java.util.Random;
import java.util.Scanner;

public class TPN6Ejercicio6 {
    public static void main(String[] args) {
        String[] vec = new String[6];
        String existe;
        int i=0;
        Scanner teclado0 = new Scanner(System.in);
        Scanner teclado1 = new Scanner(System.in);
        for (i=0; i < vec.length; i++) {
            System.out.printf("Ingrese palabra "+(i+1)+": ");
            vec[i] = teclado0.nextLine();
        }
        System.out.printf("Ingrese palabra para comprobar si existe: ");
        existe = teclado0.nextLine();
        boolean res = false;
        for(int a=0; a < vec.length; a++){
            if(existe.equalsIgnoreCase(vec[a])){

                res = true;
                break;
            };
        }
        System.out.printf("Existe: "+ res);
    }
}
