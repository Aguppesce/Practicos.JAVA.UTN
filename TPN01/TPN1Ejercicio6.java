package Trabajos_Practicos.TPN1;
import java.util.Scanner;

public class TPN1Ejercicio6 {

        public static void main(String[] args){
            float nota1;
            float nota2;
            float nota3;
            System.out.println("Introduzca tres notas: ");
            Scanner teclado0=new Scanner(System.in);
            nota1=teclado0.nextFloat();
            Scanner teclado1=new Scanner(System.in);
            nota2=teclado1.nextFloat();
            Scanner teclado2=new Scanner(System.in);
            nota3=teclado2.nextFloat();
            System.out.println("Promedio:" +(nota1+nota2+nota3)/3);


    }
}
