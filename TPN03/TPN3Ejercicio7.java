package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio7 {
    public static void main(String[] args){
        String palabra;
        int cont=0;
        System.out.printf("Ingrese una palabra: ");
        Scanner teclado=new Scanner(System.in);
        palabra=teclado.nextLine();
        //System.out.println(palabra.length());
        for(int i = 0; i < palabra.length(); i++){
            if(palabra.charAt(i)=='a'||palabra.charAt(i)=='e'||palabra.charAt(i)=='i'||palabra.charAt(i)=='o'||palabra.charAt(i)=='u')
            {
                System.out.println(palabra.charAt(i));
                cont=cont+1;
            }
        }
        System.out.println("Cantidad de vocales:"+cont);
    }
}