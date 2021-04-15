package Trabajos_Practicos.TPN4;
import java.util.Scanner;

public class TPN4Ejercicio6 {
    public static void main(String[] args){
        int num;
        do{
            System.out.printf("Ingrese un numero positivo: ");
            Scanner teclado0=new Scanner(System.in);
            num=teclado0.nextInt();
            if(num>0){
                System.out.println("El logaritmo es: "+Math.log(num));
            }
        }while(num<0);
    }
}