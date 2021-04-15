package Trabajos_Practicos.TPN2;
import java.util.Scanner;
import java.lang.Math;

public class TPN2Ejercicio17 {
    public static void main(String[] args){
        int a;
        int b;
        int c;
        System.out.printf("Ingrese a: ");
        Scanner teclado0=new Scanner(System.in);
        a=teclado0.nextInt();
        System.out.printf("Ingrese b: ");
        Scanner teclado1=new Scanner(System.in);
        b=teclado1.nextInt();
        System.out.printf("Ingrese c: ");
        Scanner teclado2=new Scanner(System.in);
        c=teclado2.nextInt();
        if(a<550&&b<550&&c<550)
        {
            //System.out.println("Son menores a 550");
            if(a==b){
                System.out.println("A y B son iguales");}
            if(a==c){
                System.out.println("A y C son iguales");}
            if(b==c){
                System.out.println("B y C son iguales");}
            if(a==b&&a==c&&b==c){
                System.out.println("Son los tres iguales");}
            if(a!=b){
                System.out.println("A y B son distintos");}
            if(a!=c){
                System.out.println("A y C son distintos");}
            if(b!=c){
                System.out.println("B y C son distintos");}
            if(a!=b&&a!=c&&b!=c){
                System.out.println("Son los tres distintos");}
        }else{
            System.out.println("Todos los numeros son mayores a 550");
        }
    }
}