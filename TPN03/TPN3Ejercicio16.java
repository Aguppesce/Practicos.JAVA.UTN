package Trabajos_Practicos.TPN3;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Random;

public class TPN3Ejercicio16 {
    public static void main(String[] args) {
        int[] vec = new int[20];
        int num, ceros, unos;
        int i;
        Random rndm = new Random();
        for (i = 0; i < vec.length; i++) {
            num = rndm.nextInt(2) + 0;
            vec[i] = num;
            System.out.printf(" " + vec[i]);
        }
        System.out.println();
        for (int j = 0; j < vec.length; j++) {
            if (vec[j] < 1) {
                System.out.printf(" " + vec[j]);
            }
        }
        for (int j=0; j<vec.length; j++){
            if(vec[j]>0){
                System.out.printf(" " + vec[j]);
            }
        }
    }
}
