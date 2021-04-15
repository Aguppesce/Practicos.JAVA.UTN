package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio14 {
    public static void main(String[] args){
        int a;
        int b;
        System.out.println("Ingrese a:");
        Scanner teclado1=new Scanner(System.in);
        a=teclado1.nextInt();
        System.out.println("Ingrese b");
        Scanner teclado2=new Scanner(System.in);
        b=teclado2.nextInt();
        if(a>b)
        {
            System.out.println("A es mayor que B");
        }
        else if (a<b)
        {
            System.out.println("B es mayor que A");
        }
    }
}