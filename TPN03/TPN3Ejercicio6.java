package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio6 {
    public static void main(String[] args){
        String palabra;
        System.out.printf("Ingrese una palabra: ");
        Scanner teclado=new Scanner(System.in);
        palabra=teclado.nextLine();
        for(int n = 0; n < palabra.length(); n++){
            if(palabra.charAt(n)!='a'&&palabra.charAt(n)!='e'&&palabra.charAt(n)!='i'&&palabra.charAt(n)!='o'&&palabra.charAt(n)!='u')
            {
                System.out.println(palabra.charAt(n));
            }
        }
    }
}