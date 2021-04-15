package Trabajos_Practicos.TPN1;
import java.util.Scanner;

public class TPN1Ejercicio5 {

        public static void main(String[] args){
            float pulgadas=0;
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduzca la medida en pulgadas: ");
            pulgadas= teclado.nextFloat();
            System.out.println("Resultado en Metros:" +(0.0254f*pulgadas));


    }
}
