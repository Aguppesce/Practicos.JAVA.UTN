package Trabajos_Practicos.TPN7.Ejercicio2;
import java.util.Scanner;

public class ProgramaItem {

    public static void main(String[] args) {

        Item capacitores=new Item("capacitor", 135);
        Item ledamarillos=new Item("led amarillo", 25);
        Item botonreles=new Item("boton rele", 187);
        Item parlantes=new Item("parlante", 380);

        int total, cantcap, cantled, cantrele, cantparl, cantmes, cantdias;
        System.out.println("Ingrese cantidad de capacitores");
        Scanner teclado0=new Scanner(System.in);
        cantcap=teclado0.nextInt();
        capacitores.setCantidad(cantcap);
        System.out.println("Ingrese cantidad de leds amarillos");
        Scanner teclado1=new Scanner(System.in);
        cantled=teclado1.nextInt();
        ledamarillos.setCantidad(cantled);
        System.out.println("Ingrese cantidad de botones reles");
        Scanner teclado2=new Scanner(System.in);
        cantrele=teclado2.nextInt();
        botonreles.setCantidad(cantrele);
        System.out.println("Ingrese cantidad de parlantes");
        Scanner teclado3=new Scanner(System.in);
        cantparl=teclado3.nextInt();
        parlantes.setCantidad(cantparl);
        System.out.printf("Ingrese cantidad de meses para calcular ingreso/s de N meses: ");
        Scanner teclado4=new Scanner(System.in);
        cantmes=teclado4.nextInt();
        total= capacitores.getCantidad()*capacitores.getPreciounitario()+ledamarillos.getCantidad()*ledamarillos.getPreciounitario()+botonreles.getCantidad()*botonreles.getPreciounitario()+parlantes.getCantidad()*parlantes.getPreciounitario();
        System.out.println("El total es: $"+total/cantmes);
        System.out.println("Porcentaje del 50%: "+(total/cantmes)*0.5);
        System.out.println("Porcentaje del 120%: "+(total/cantmes)*1.2);
        System.out.println("Porcentaje del 350%: "+(total/cantmes)*3.5);
        System.out.println("Ingrese cantidad de dias para calcular Stock ");
        Scanner teclado5=new Scanner(System.in);
        cantdias=teclado5.nextInt();
        System.out.println("Capacitores necesarios: "+(Math.round(capacitores.getCantidad()/cantdias)*cantdias));


    }

}
