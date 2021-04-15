package Trabajos_Practicos.TPN3;

import java.util.Arrays;

public class TPN3Ejercicio17 {
    public static void main(String[] args) {
        int[][] mat= {{4,7,-5,4},{0,3,-2,6},{1,2,4,1},{6,1,0,3}};
        int sum=0;
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat.length; j++) {
                System.out.print(mat[i][j] + "\t");
            }
            System.out.println();
        }
        for (int i = 0; i < mat.length; i++) {
            for(int j =0; j< mat[i].length; j++){
                if(i==j){
                    sum= sum+mat[i][i] ;
                }
            }
        }
        System.out.println("La suma de la diagonal principal es: " + sum);

    }

}


