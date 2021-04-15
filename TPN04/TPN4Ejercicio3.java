package Trabajos_Practicos.TPN4;
import java.util.Scanner;

public class TPN4Ejercicio3 {
    public static void main(String[] args){
        String palabra;
        System.out.printf("Ingrese una palabra: ");
        Scanner teclado0=new Scanner(System.in);
        palabra=teclado0.nextLine();
        for(int i=0;i<palabra.length(); i++){
            System.out.println(palabra.charAt(i));
            System.out.print(" ");
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
        }
    }
}