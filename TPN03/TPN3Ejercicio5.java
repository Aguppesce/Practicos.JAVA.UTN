package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio5 {
    public static void main(String[] args){
        String palabra;
        int i=0;
        System.out.printf("Ingrese una palabra: ");
        Scanner teclado0=new Scanner(System.in);
        palabra=teclado0.nextLine();
        for(i=palabra.length()-1;i>=0;i--){
            System.out.println(palabra.charAt(i));
        }
    }
}
