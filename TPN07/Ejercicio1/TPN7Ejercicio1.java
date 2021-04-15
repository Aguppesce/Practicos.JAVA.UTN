package Trabajos_Practicos.TPN7.Ejercicio1;

public class TPN7Ejercicio1 {
    public static void main(String[] args) {

        int cantcapacitores = 200;
        int cantledamarillos = 50;
        int cantbotonreles = 230;
        int cantparlantes = 65;
        int preccap = 135;
        int precledam = 25;
        int precboton = 187;
        int precparlante = 380;
        int totalcapacitores = cantcapacitores * preccap;
        int totaledam = cantledamarillos * precledam;
        int totalreles = cantbotonreles * precboton;
        int totalparlantes = cantparlantes * precparlante;
        int total=totalcapacitores+totaledam+totalparlantes+totalreles;
        int mensual=total/4;

        System.out.println("Ingreso mensual: $"+mensual);

        System.out.println("Ingreso de ventas que alcanzan el 50% "+mensual*0.5);
        System.out.println("Ingreso de ventas que alcanzan el 120% "+mensual*1.2);
        System.out.println("Ingreso de ventas que alcanzan el 350% "+mensual*3.5);

        System.out.println("Stock de capacitores para 30 días: "+cantcapacitores/4);
        System.out.println("Stock de leds amarillos para 30 días: "+cantledamarillos/4);
        System.out.println("Stock de botones reles para 30 días: "+cantbotonreles/4);
        System.out.println("Stock de parlantes para 30 días: "+cantparlantes/4);

        System.out.println("Stock de capacitores para 45 días: "+(Math.round(cantcapacitores/1.5)));
        System.out.println("Stock de leds amarillos para 45 días: "+Math.round(cantledamarillos/1.5));
        System.out.println("Stock de botones reles para 45 días: "+Math.round(cantbotonreles/1.5));
        System.out.println("Stock de parlantes para 45 días: "+Math.round(cantparlantes/1.5));

        System.out.println("Stock de capacitores para 90 días: "+(Math.round(cantcapacitores/4)*3));
        System.out.println("Stock de leds amarillos para 90 días: "+(Math.round(cantledamarillos/4)*3));
        System.out.println("Stock de botones reles para 90 días: "+(Math.round(cantbotonreles/4)*3));
        System.out.println("Stock de parlantes para 90 días: "+(Math.round(cantparlantes/4)*3));


    }
}
