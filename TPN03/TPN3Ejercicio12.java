package Trabajos_Practicos.TPN3;
import java.util.Scanner;
import java.lang.Math;

public class TPN3Ejercicio12 {
    public static void main(String[] args){
        int[] num=new int[30];
        Scanner teclado=new Scanner(System.in);
        int suma=0;
        for(int i=0;i<30;i++)
        {
            System.out.printf("Introduzca nota "+(i+1)+": ");
            num[i]=teclado.nextInt();
            suma=suma+num[i];
        }
        System.out.println(suma/30);
    }
}
