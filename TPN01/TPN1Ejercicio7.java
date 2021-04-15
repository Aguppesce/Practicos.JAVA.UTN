package Trabajos_Practicos.TPN1;
import java.util.Scanner;
import java.lang.Math;

public class TPN1Ejercicio7 {

        public static void main(String[] args){
            float a;
            float b;
            float c;
            double raiz1;
            double raiz2;
            System.out.println("Introduzca valor a, b y c: ");
            Scanner teclado0=new Scanner(System.in);
            a=teclado0.nextFloat();
            Scanner teclado1=new Scanner(System.in);
            b=teclado1.nextFloat();
            Scanner teclado2=new Scanner(System.in);
            c=teclado2.nextFloat();
            raiz1=(-b+Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            System.out.println("Raiz 1:"+raiz1);
            raiz2=(-b-Math.sqrt(Math.pow(b,2)-4*a*c))/(2*a);
            System.out.println("Raiz 1:"+raiz2);
        }

    }
