package Trabajos_Practicos.TPN4;
import java.util.Scanner;

public class TPN4Ejercicio4 {
    public static void main(String[] args){
        int num;
        System.out.printf("Ingrese un numero: ");
        Scanner teclado0=new Scanner(System.in);
        num=teclado0.nextInt();
        for(int i=0;i<num;i++){
            System.out.println();
            System.out.printf("X");
            for(int j=0;j<i;j++){
                System.out.print("X");
            }
        }
    }
}