package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio2 {
    public static void main(String[] args){
        int num;
        Scanner teclado0=new Scanner(System.in);
        num=teclado0.nextInt();
        System.out.println("Ingrese un numero entre 1 y 10");
        switch(num) {
            case 1:
                System.out.println("UNO");
                break;
            case 2:
                System.out.println("DOS");
                break;
            case 3:
                System.out.println("TRES");
                break;
            case 4:
                System.out.println("CUATRO");
                break;
            case 5:
                System.out.println("CINCO");
                break;
            case 6:
                System.out.println("SEIS");
                break;
            case 7:
                System.out.println("SIETE");
                break;
            case 8:
                System.out.println("OCHO");
                break;
            case 9:
                System.out.println("NUEVE");
                break;
            case 10:
                System.out.println("DIEZ");
                break;
            default:
                System.out.println("OTRO");
        }
    }
}