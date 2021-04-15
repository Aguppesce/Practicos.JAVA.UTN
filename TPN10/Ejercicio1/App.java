package Trabajos_Practicos.TPN10.Ejercicio1;

public class App {
    public static void main(String[] args) {
        Terna <String> t1;
        Terna <Integer> t2;
        Terna <Float> t3;

        t1= new Terna<String>();
        t2= new Terna<Integer>();
        t3= new Terna<Float>();

        t1.setElemento(1, "hola");
        t1.setElemento(2,"chau");
        t1.setElemento(3,"hola de nuevo");

        t2.setElemento(1,20);
        t2.setElemento(2,30);
        t2.setElemento(3,50);

        t3.setElemento(1, 0.5f);
        t3.setElemento(2, 0.9f);
        t3.setElemento(3, 1.0f);

        System.out.println(t1);
        System.out.println(t2);
        System.out.println(t3);

    }
}
