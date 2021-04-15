package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio16 {
    public static void main(String[] args){
        int a;
        int num;
        System.out.println("Ingrese a:");
        Scanner teclado1=new Scanner(System.in);
        a=teclado1.nextInt();
        num=a%2;
        if(a%2==0)
        {
            System.out.println("Es par");
        }
        else
        {
            System.out.println("Es impar");
        }
    }
}