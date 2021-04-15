package Trabajos_Practicos.TPN5.Ejercicio5;

import Trabajos_Practicos.TPN5.Ejercicio2.Zapatilla;

import java.util.Scanner;

public class LocalZapatillas {
    public static void main(String[] args) {
        Zapatillas[] modelosVendo = new Zapatillas[6];
        String mdlo;
        String mrca;
        String ind = "";
        int nro=0,contt=0,contc=0;
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            modelosVendo[i] = new Zapatillas("", "","",0);
            System.out.printf("Introduzca modelo: ");
            mdlo = teclado.next();
            modelosVendo[i].setModelo(mdlo);
            System.out.printf("Introduzaca marca: ");
            mrca = teclado.next();
            modelosVendo[i].setMarca(mrca);
            System.out.printf("Introduzca industria: ");
            ind = teclado.next();
            modelosVendo[i].setIndustria(ind);
            System.out.printf("Introduzca numero: ");
            nro = teclado.nextInt();
            modelosVendo[i].setNro(nro);
        }
        for(int j=0; j< modelosVendo.length; j++){
            //String ind = modelosVendo[j].getIndustria();
            if(ind=="taiwan"){
                contt=contt+1;
            }else if(ind=="canada"){
                contc=contc+1;
            }
        }
        if(contt<contc){
            System.out.println("Hay mas de la industria de taiwan");
        }
        else{
            System.out.println("Hay mas de la industria de canada");
        }
        System.out.println("Taiwan: "+contt);
        System.out.println("Canada: "+contc);
        teclado.close();
    }
}
