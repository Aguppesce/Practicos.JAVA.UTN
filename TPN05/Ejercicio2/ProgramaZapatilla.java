package Trabajos_Practicos.TPN5.Ejercicio2;

public class ProgramaZapatilla {
    public static void main(String[] args) {
        Zapatilla z1= new Zapatilla("nike","cualquiera",42,"Argentina");
        Zapatilla z2= new Zapatilla("nike","otra",42,"Argentina");

        System.out.println(z1.getMarca());
        System.out.println(z2.getMarca());
        if(z1.getMarca()==z2.getMarca()){
            System.out.println("Son iguales");
        }else{
            System.out.println("Son distintas");
        }
    }
}