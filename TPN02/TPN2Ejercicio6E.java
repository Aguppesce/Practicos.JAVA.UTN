package Trabajos_Practicos.TPN2;

import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio6E{

    public static void main(String[] args){
        float x;
        float y;
        float a;
        float b;
        float resultado;
        System.out.println("Ingrese valor para x:");
        Scanner teclado0=new Scanner(System.in);
        x=teclado0.nextFloat();
        System.out.println("Ingrese valor para y:");
        Scanner teclado1=new Scanner(System.in);
        y=teclado1.nextFloat();
        System.out.println("Ingrese valor para a:");
        Scanner teclado2=new Scanner(System.in);
        a=teclado2.nextFloat();
        System.out.println("Ingrese valor para b:");
        Scanner teclado3=new Scanner(System.in);
        b=teclado3.nextFloat();
        resultado=(x*y)/(a*b);
        System.out.println("Resutlado Ejercicio e:");
        System.out.println(resultado);
    }
}