package Trabajos_Practicos.TPN6;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TPN6Ejercicio9 {
    public static void main(String[] args) {
        //Integer[][] mat=new Integer[3][3];
        int mat[][] = new int[0][];
        int num,fila,columna,nfilas=0,ncolumnas=0;
        int sum=0,sum1=0;
        int opcion=0;
        int i=0,j=0;
        boolean llena=false;
        Random ranm=new Random();
        Scanner teclado0=new Scanner(System.in);
        do{
            System.out.println("\n1) Llenar matriz\n2) Suma de una fila\n3) Suma de una columna\n4) Sumar la diagonal principal\n5) Sumar la diagonal inversa\n6) Media de la matriz\n7) Mostrar Matriz\n8) Llenar matriz automaticamente\n0) Salir");
            System.out.printf("Elija una opcion: ");
            opcion=teclado0.nextInt();
            switch (opcion) {
                case 1:
                    System.out.printf("Ingrese cantidad de filas: ");
                    nfilas = teclado0.nextInt();
                    System.out.printf("Ingrese cantidad de columnas: ");
                    ncolumnas = teclado0.nextInt();
                    mat = new int[nfilas][ncolumnas];
                    if(nfilas==ncolumnas) {
                        for (i = 0; i < nfilas; i++) {//también puede ser i < mat.length
                            for (j = 0; j < ncolumnas; j++) {//también puede ser j < mat.length
                                System.out.printf("Ingrese valores de la fila [" + (i + 1) + "] columna [" + (j + 1) + "] de la matriz: ");
                                num = teclado0.nextInt();
                                mat[i][j] = num;
                                //System.out.println(mat[i][j]);
                            }
                        }
                    }else{
                        System.out.println("Debe tener el mismo numero de columnas y filas");
                    }
                    llena = true;
                    break;
                case 2://Suma filas
                    sum=0;
                    if (llena == false) {
                        System.out.println("Debe llenar la matriz primero");
                    } else {
                        System.out.printf("Elija la fila que quiere sumar: ");
                        fila = teclado0.nextInt();
                        if ((fila > nfilas) || (fila<=0)) {//también puede ser filas>mat.length
                            System.out.println("La fila no existe");
                        } else {
                            for (j = 0; j < nfilas; j++) {//también puede ser j<mat[fila].length
                                sum = sum + mat[fila-1][j];
                            }
                            System.out.printf("La suma de la fila " + fila + " es: " + sum);
                        }
                    }
                    break;
                case 3://Suma columnas
                    sum=0;
                    if(llena==false) {
                        System.out.println("Debe llenar la matriz primero");
                    }else {
                        System.out.println("Elija la columna que quiere sumar: ");
                        columna = teclado0.nextInt();
                        if ((columna > ncolumnas)||(columna <=0)){
                            System.out.println("La columna no existe");
                        }else{
                            for (i = 0; i < ncolumnas; i++) {
                                sum = sum + mat[i][columna-1];
                            }
                            System.out.printf("La suma de la columna " + columna + " es: " + sum);
                        }
                    }
                    break;
                case 4://Diagonal principal
                    sum=0;
                    if(llena==false) {
                        System.out.println("Debe llenar la matriz primero");
                    }else {
                        for (i = 0; i < mat.length; i++) {
                            for(j =0; j< mat[i].length; j++){
                                if(i==j){
                                    sum= sum+mat[i][i] ;
                                }
                            }
                        }
                        System.out.println("La suma de la diagonal principal es: " + sum);
                    }
                    break;
                case 5://Diagonal inversa
                    sum=0;
                    if(llena==false) {
                        System.out.println("Debe llenar la matriz primero");
                    }else {
                        for (i = 0; i < nfilas; i++) {
                            for (j = 0; j < ncolumnas; j++) {
                                if (i + j == mat.length - 1) {
                                    sum = sum + mat[i][j];
                                }
                            }
                        }
                        System.out.printf("La suma de la diagonal inversa es:" + sum);
                    }
                    break;
                case 6://Media de la matriz
                    if(llena==false) {
                        System.out.println("Debe llenar la matriz primero");
                    }else {
                        sum=0;
                        float media=0.0f;
                        for (i = 0; i < nfilas; i++) {
                            for (j = 0; j < ncolumnas; j++) {
                                sum = sum + mat[i][j];
                            }
                        }
                        media=sum/mat.length;
                        System.out.println("La media es: "+(media));
                    }
                    break;
                case 7://Mostrar matriz
                    if(llena==false) {
                        System.out.println("Debe llenar la matriz primero");
                    }else {
                        System.out.println("La matriz es:");
                        for (i = 0; i < mat.length; i++) {
                            for (j = 0; j < mat.length; j++) {
                                System.out.print(mat[i][j] + "\t");
                            }
                            System.out.println();
                        }
                        System.out.println(Arrays.deepToString(mat));
                    }
                    break;
                case 8://Llenar matriz automáticamente
                    System.out.printf("Ingrese cantidad de filas: ");
                    nfilas = teclado0.nextInt();
                    System.out.printf("Ingrese cantidad de columnas: ");
                    ncolumnas = teclado0.nextInt();
                    mat= new int [nfilas][ncolumnas];
                    if(nfilas==ncolumnas) {
                        for (i = 0; i < nfilas; i++) {
                            for (j = 0; j < ncolumnas; j++) {
                                num = ranm.nextInt(10) + 1;
                                mat[i][j] = num;
                            }
                        }
                    }else{
                        System.out.println("Debe tener el mismo numero de columnas y filas");
                    }
                    llena=true;
                    break;
                default:
                    System.out.println("Opcion desconocida, teclee otra vez");
                    break;
            }
        }while(opcion!=0);
    }
}