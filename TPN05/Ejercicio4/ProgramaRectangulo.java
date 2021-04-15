package Trabajos_Practicos.TPN5.Ejercicio4;
import java.util.Scanner;

public class ProgramaRectangulo {
    public static void main(String[] args) {
        Rectangulo[] recs= new Rectangulo[5];
        int bas, alt;
        Scanner teclado=new Scanner(System.in);

        for (int i=0; i<5;i++){
            recs[i] = new Rectangulo(0,0);
            System.out.printf("Introduzca base del rectangulo "+(i+1)+": ");
            bas = teclado.nextInt();
            recs[i].setBase(bas);
            System.out.printf("Introduzca altura del rectangulo "+(i+1)+": ");
            alt = teclado.nextInt();
            recs[i].setAltura(alt);
        }

        for(int j=0;j<5; j++){
            System.out.println("Resultado de perimetro de rectangulo "+(j+1)+": "+recs[j].getPerimetro());
            System.out.println("Resultado de area de rectangulo "+(j+1)+": "+recs[j].getArea());
        }
        teclado.close();
    }
}
