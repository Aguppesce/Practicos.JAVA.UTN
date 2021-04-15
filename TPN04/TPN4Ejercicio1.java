package Trabajos_Practicos.TPN4;
import java.util.Scanner;
//Con FOR
public class TPN4Ejercicio1 {
    public static void main(String[] args){
        int[] num=new int[8];
        int sum=0;
        int j=0;
        int cont=0;
        Scanner teclado0=new Scanner(System.in);
        for(int i=0;i<num.length;i++){
            System.out.printf("Ingrese numero "+(i+1)+" : ");
            num[i]=teclado0.nextInt();
            sum=sum+num[i];
        }
        System.out.println("Suma de los 8 numeros: "+sum);
    }
}

/*
//Con WHILE
import java.util.Scanner;
public class TPN4Ejercicio1 {
    public static void main(String[] args){
        int[] num=new int[9];
        int sum=0;
        int cont=0;
        int i=0;
        Scanner teclado0=new Scanner(System.in);
        while(i<8){
            System.out.printf("Ingrese numero "+(i+1)+" : ");
            num[i]=teclado0.nextInt();
            sum=sum+num[i];
            i++;
        }
        System.out.println("Suma de los 8 numeros:"+sum);
    }
}*/