/*
package Trabajos_Practicos.TPN6.TPN6Ejercicio10;


import java.util.Random;
import java.util.Scanner;

public class ProgramaDado {
    public static void main(String[] args) {
        Dado[] d1=new Dado[6];
        int caras,vmin,vmax;
        Random rnd=new Random();
        String opcion = "";
        System.out.println("Primero hay que crear el dado");
        System.out.printf("Ingrese cantidad de caras: ");
        Scanner teclado=new Scanner(System.in);
        caras=teclado.nextInt();
        d1.setCantcaras(caras);
        System.out.printf("Ingrese valor minimo: ");
        vmin=teclado.nextInt();
        d1.setValormin(vmin);
        System.out.printf("Ingrese valor maximo: ");
        vmax=teclado.nextInt();
        d1.setValormax(vmax);
        do {
            System.out.println("-> Tirar dados (t)\n-> Salir(s)");
            System.out.printf("Ingrese su opcion: ");
            opcion=teclado.nextLine();
            switch (opcion) {
                case "t": //tirar dados
                    for(int i=d1.getValormin(); i<d1.getValormax(); i++){
                        d1=new Dado(0,0,0,0,0);



                    }


                    break;
                default:
                    System.out.println("Debe ingresar 't' o 's'");
                    break;
            }
        } while (!(opcion != "s"));
    }
}
*/