package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio10 {
    public static void main(String[] args){
        int num;
        int primo=0;
        System.out.printf("Ingrese un numero: ");
        Scanner teclado=new Scanner(System.in);
        num=teclado.nextInt();
        for(int i=2;i<num;i++)
        {
            if(num%i==0){
                primo=1;}
        }
        if(primo==1){
            System.out.println(+num+" No es primo");
        }else if(primo==0){
            System.out.println(+num+" Es Primo");
        }
    }
}