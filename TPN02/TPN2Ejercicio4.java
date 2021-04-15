package Trabajos_Practicos.TPN2;
import java.util.Scanner;

public class TPN2Ejercicio4 {
        public static void main(String[] args){
            String cadena;
            System.out.println("Ingrese una frase: ");
            Scanner teclado= new Scanner(System.in);
            cadena=teclado.nextLine();
            System.out.println(cadena.replace("t","p"));

    }
}
