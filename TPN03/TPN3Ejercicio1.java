package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio1 {
    public static void main(String[] args){
        int num1;
        int num2;
        int y=0;
        System.out.println("Ingrese 2 numeros: ");
        Scanner teclado0=new Scanner(System.in);
        num1=teclado0.nextInt();
        Scanner teclado1=new Scanner(System.in);
        num2=teclado1.nextInt();
        System.out.println("Numero 1: "+num1);
        System.out.println("Numero 2: "+num2);
        y=num1;
        num1=num2;
        num2=y;
        System.out.println("Numero 1 cambiado:"+num1);
        System.out.println("Numero 2 cambiado:"+num2);
    }
}