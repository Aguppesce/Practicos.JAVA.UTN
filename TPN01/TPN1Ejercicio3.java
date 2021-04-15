package Trabajos_Practicos.TPN1;

import java.util.Scanner;

public class TPN1Ejercicio3 {

        public static void main(String[] args){

            float temp;
            float convertidor;
            System.out.println("Introduzca temperatura en Farenheit ");
            Scanner teclado=new Scanner(System.in);
            temp=teclado.nextFloat();
            System.out.println("La temperatura en Celsius es: "+(5f/9f)*(temp-32f));


    }
}
