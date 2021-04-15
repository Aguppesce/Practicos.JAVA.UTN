package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio18 {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        System.out.printf("Ingrese a: ");
        Scanner teclado0=new Scanner(System.in);
        a=teclado0.nextInt();
        System.out.printf("Ingrese b: ");
        Scanner teclado1=new Scanner(System.in);
        b=teclado1.nextInt();
        System.out.printf("Ingrese c: ");
        Scanner teclado2=new Scanner(System.in);
        c=teclado2.nextInt();
        if(a<b&&b<c)
        {
            System.out.println("Estan en orden creciente");
        }else if(a>b&&b>c){
            System.out.println("Estan en orden decreciente");
        }else{
            System.out.println("No cumplen un orden");
        }
    }
}