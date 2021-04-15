package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio8 {
    public static void main(String[] args){
        String palabra;
        int cont=0;
        System.out.printf("Ingrese una palabra: ");
        Scanner teclado=new Scanner(System.in);
        palabra=teclado.nextLine();
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i)==' ')
            {
                cont++;
            }
        }
        System.out.println("Cantidad de espacios:"+cont);
    }
}
