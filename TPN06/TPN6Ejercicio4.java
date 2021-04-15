package Trabajos_Practicos.TPN6;
import java.util.Arrays;
import java.util.Random;

public class TPN6Ejercicio4 {
    public static void main(String[] args){
        int[] vec0=new int[8];
        int[] vec1=new int[8];
        int sumaprod=0;
        int prod;
        for(int i=0; i<8; i++) {
            vec0[i] = i;
            vec1[i] = i;
            prod=vec0[i]*vec1[i];
            System.out.println("Producto: "+prod);
            sumaprod=sumaprod+prod;
        }
        System.out.println("Producto escalar:" +sumaprod);
    }
}