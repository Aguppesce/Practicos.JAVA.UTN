package Trabajos_Practicos.TPN2;
import java.util.Scanner;

public class TPN2Ejercicio5 {
        public static void main(String[] args){
            System.out.println("Introduzca una frase:");
            String cadena;
            Scanner teclado= new Scanner(System.in);
            cadena=teclado.nextLine();
            System.out.println(cadena.toUpperCase()); //a)
            System.out.println(cadena.toLowerCase()); //b)
            System.out.println(cadena.concat(cadena)); //c
            System.out.println(cadena.replaceAll("[a|e|i|o|u]"," ")); //d
            System.out.println(cadena.endsWith("!"));//e
            System.out.println(cadena.startsWith("H"));
    }
}
