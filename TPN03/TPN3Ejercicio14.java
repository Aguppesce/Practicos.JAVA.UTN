package Trabajos_Practicos.TPN3;
import java.util.Scanner;

public class TPN3Ejercicio14 {
    public static void main(String[] args){
        int[] num=new int[10];
        int max=0;
        Scanner teclado=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.print("Ingrese numero "+(i+1)+": ");
            num[i]=teclado.nextInt();
            while(max<num[i]){
                max=num[i];
            }
        }
        System.out.println("El maximo es: "+max);
    }
}
