package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio6C {
        public static void main(String[] args){
            double b;
            System.out.println("Ingrese valor para b:");
            Scanner teclado=new Scanner(System.in);
            b=teclado.nextFloat();
            System.out.println("Resutlado: "+Math.pow(b,2)/2);
    }
}
