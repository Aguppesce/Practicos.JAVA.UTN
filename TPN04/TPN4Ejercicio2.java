package Trabajos_Practicos.TPN4;
import java.util.Scanner;

public class TPN4Ejercicio2 {
    public static void main(String[] args){
        int num=0;
        System.out.printf("Ingrese tamaño del cuadrado: ");
        Scanner teclado0=new Scanner(System.in);
        num=teclado0.nextInt();
        if(num%2!=0){
            for(int i=0;i<num; i++){
                System.out.print("X");
            }
            System.out.println();
            for(int i=0;i<num-2; i++){
                System.out.print("X");
                for (int j=0; j<num-2; j++){
                    System.out.print(" ");
                }
                System.out.println("X");
            }
            for(int i=0;i<num; i++){
                System.out.print("X");
            }
        }else if(num%2==0){
            num=num+1;
            for(int i=0;i<num; i++){
                System.out.print("X");
            }
            System.out.println();
            for(int i=0;i<num-2; i++){
                System.out.print("X");
                for (int j=0; j<num-2; j++){
                    System.out.print(" ");
                }
                System.out.println("X");
            }
            for(int i=0;i<num; i++){
                System.out.print("X");
            }
        }
    }
}