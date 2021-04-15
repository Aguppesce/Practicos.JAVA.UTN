package Trabajos_Practicos.TPN6;
import java.util.Random;

public class TPN6Ejercicio1 {
    public static void main(String[] args){
        int[] vec=new int[50];
        int num=0;
        Random r=new Random();
        for(int i=0;i<vec.length;i++){
            num=r.nextInt(50)+1;
            vec[i]=num;
            System.out.println(vec[i]);
        }
    }
}
