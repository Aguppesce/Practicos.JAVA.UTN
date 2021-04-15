package Trabajos_Practicos.TPN6;
import java.util.Arrays;
import java.util.Random;
import java.lang.Math;
public class TPN6Ejercicio3 {
        public static void main(String[] args){
            int[][] mat=new int[6][3];
            int[] vec=new int[6];
            int numm;
            Random ranm=new Random();
            for(int i=0; i<6; i++){
                for(int j=0; j<3; j++){
                    numm=ranm.nextInt(10)+1;
                    mat[i][j]=numm;
                    System.out.printf(" "+mat[i][j]);
                }
                vec[i] = ranm.nextInt(10)+1;
                System.out.println();
            }
            for(int a=0; a<vec.length; a++){
                mat[a][1]=vec[a]*mat[a][1];
                System.out.print(" "+mat[a][1]);
            }
            System.out.println(Arrays.toString(vec));
        }
    }

