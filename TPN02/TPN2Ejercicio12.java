package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio12 {
    public static void main(String[] args){
        int x;
        int y;
        System.out.println("Ingrese un numero:");
        Scanner teclado0=new Scanner(System.in);
        x=teclado0.nextInt();
        System.out.println("Ingrese otro numero:");
        Scanner teclado1=new Scanner(System.in);
        y=teclado0.nextInt();
        if(x==y){
            System.out.println("1");}
        else {
            System.out.println("0");
        }
    }
}