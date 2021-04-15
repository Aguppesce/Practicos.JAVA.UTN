package Trabajos_Practicos.TPN2;

import java.util.Scanner;
import java.lang.Math;
public class TPN2Ejercicio13 {

    public static void main(String[] args){
        int n;
        int a;
        int b;
        System.out.println("Ingrese n:");
        Scanner teclado0=new Scanner(System.in);
        n=teclado0.nextInt();
        System.out.println("Ingrese a:");
        Scanner teclado1=new Scanner(System.in);
        a=teclado1.nextInt();
        System.out.println("Ingrese b");
        Scanner teclado2=new Scanner(System.in);
        b=teclado2.nextInt();
        if(n>=a&&n<=b||n>=b&&n<=a)
        {
            System.out.println("Verdadero");
        }
        else
        {
            System.out.println("Falso");
        }
    }
}