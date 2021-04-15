package Trabajos_Practicos.TPN3;

import java.util.Scanner;

public class TPN3Ejercicio13 {
    public static void main(String[] args) {
        int num, i, n = 4, cont = 2;
        String cad = "";
        Scanner sc = new Scanner(System.in);
        System.out.printf("Ingrese los primeros n numeros primos: ");
        num = sc.nextInt();
        if (num > 2) {
            cad = "2 - 3";
            while (cont < num) {
                i = 2;
                while (i <= n) {
                    if (i == n) {
                        cad = cad + " - " + n;
                        cont = cont + 1;
                    } else {
                        if (n % i == 0) {
                            i = n;
                        }
                    }
                    i = i + 1;
                }
                n = n + 1;
            }
            System.out.println(cad);
        } else {
            if (num > 0) {
                if (num == 1) {
                    System.out.println("Es primo 2");
                } else {
                    System.out.println("es primo 2,3");
                }
            } else {
                System.out.println("Ingresa numeros positivos");
            }
        }
    }
}



/*
        int[] primos = new int[0];
        int cont = 0;
        int j = 0;
        while (cont <= 20) {
            boolean primo = true;
            int i = 0;
            int num=0;
            num++;
            i++;
            if (num % i == 0) {
                primo = false;//no es primo
            } else {
                int aux = num; //es primo
                primos[j] = aux;
                j = j + 1;//dara error de indice o no)?
                cont++;
            }
            num++;
        }
        System.out.println(primos);

 */