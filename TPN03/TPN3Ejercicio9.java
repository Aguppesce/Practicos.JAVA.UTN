package Trabajos_Practicos.TPN3;
import java.util.Scanner;
import java.util.StringTokenizer;

public class TPN3Ejercicio9 {

    public static void main(String[] args){
        String texto;
        System.out.printf("Ingrese una frase: ");
        Scanner teclado=new Scanner(System.in);
        texto=teclado.nextLine();
        StringTokenizer frase = new StringTokenizer(texto);
        System.out.println (frase.countTokens());
    }
}