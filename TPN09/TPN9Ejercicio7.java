package Trabajos_Practicos.TPN9;

public class TPN9Ejercicio7 {
    public static void main(String[] args) {
        int [] vec=new int [50];
        Longitud(vec,1);
    }
    public static void Longitud (int [] vec, int cont) {
        if (cont == vec.length) {
            System.out.println("No hay mas elementos");
        } else {
            //System.out.println(vec[cont]);//Para mostrar los indices del vector
            Longitud(vec, cont + 1);
            System.out.println(cont);
        }
    }

}
