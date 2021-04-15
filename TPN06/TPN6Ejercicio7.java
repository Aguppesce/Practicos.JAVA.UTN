package Trabajos_Practicos.TPN6;

//import com.sun.jdi.IntegerValue;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class TPN6Ejercicio7 {
    public static void main(String[] args) {
        String[] vec = new String[10];
        Scanner teclado=new Scanner(System.in);
        int i=0;
        for(i=0; i < vec.length; i++) {
            vec[i] = teclado.nextLine();
        }
        for(i=vec.length-1; i>=0;i--){
            System.out.println(vec[i]);
        }

        Collections.reverse(Arrays.asList(vec));
        System.out.println(Arrays.toString(vec));
    }
}
