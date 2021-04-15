package Trabajos_Practicos.TPN6;
import java.util.Random;

public class TPN6Ejercicio2 {
    public static void main(String[] args){
        int[][] vec=new int[23][6];
        int num;
        Random r=new Random();
        //llena fila
        for(int i=0;i<24-1;i++){
            //llena columna
            for(int j=0;j<7-1;j++){
                num=r.nextInt(2)+0;
                vec[i][j]=num;
                System.out.printf(" "+vec[i][j]);
            }
            System.out.println();
        }
        System.out.printf(" "+vec[23][2]);
    }
}