package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio6D {
    public static void main(String[] args){
        float a,b,c,d;
        System.out.print("Ingrese valor para a:");
        Scanner teclado0=new Scanner(System.in);
        a=teclado0.nextFloat();
        System.out.print("Ingrese valor para b:");
        Scanner teclado1=new Scanner(System.in);
        b=teclado1.nextFloat();
        System.out.print("Ingrese valor para c:");
        Scanner teclado2=new Scanner(System.in);
        c=teclado2.nextFloat();
        System.out.print("Ingrese valor para d:");
        Scanner teclado3=new Scanner(System.in);
        d=teclado3.nextFloat();
        System.out.println("Resutlado: "+(a+b)*c/d);
    }
}