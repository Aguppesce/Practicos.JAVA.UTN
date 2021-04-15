package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

    public class TPN2Ejercicio6B {
        public static void main(String[] args){
            float x;
            float y;
            float resultado;
            System.out.printf("Ingrese valor para x:");
            Scanner teclado=new Scanner(System.in);
            x=teclado.nextFloat();
            System.out.printf("Ingrese valor para y:");
            Scanner teclado1=new Scanner(System.in);
            y=teclado1.nextFloat();
            resultado=(x+y)/(x-y);
            System.out.println("Resutlado :"+resultado);
    }
}
