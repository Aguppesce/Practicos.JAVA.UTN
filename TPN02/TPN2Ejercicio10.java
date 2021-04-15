package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio10 {

    public static void main(String[] args){
        float x;
        System.out.println("Ingrese un numero:");
        Scanner teclado0=new Scanner(System.in);
        x=teclado0.nextFloat();
        if(x<0){
            System.out.println("-1");}
        else {
            System.out.println("+1");
        }
    }
}