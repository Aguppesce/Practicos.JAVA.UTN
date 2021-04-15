package Trabajos_Practicos.TPN5.Ejercicio3;

import java.util.Calendar;

public class ProgramaAuto {
    public static void main(String[] args) {
        Auto usado= new Auto("Corolla","Toyota","2007","MNA098",28000,14000);
        Auto flia= new Auto("Uno","Fiat","2010","LOO123",55000,55890);
        Auto cerokm= new Auto("Ka","Ford","HGY321");


        System.out.printf("Auto usado: "+usado.getAuto()+" | "+usado.getMarca()+" | "+usado.getModelo()+" | "+usado.getPatente()+" | "+usado.getKm()+" | "+usado.getUltimocambioAceite()+"\n");
        System.out.println(usado.cambioAceite()+"\n");
        System.out.println("Auto familia: "+flia.getAuto()+" | "+flia.getMarca()+" | "+flia.getModelo()+" | "+flia.getPatente()+" | "+flia.getKm()+" | "+flia.getUltimocambioAceite());
        System.out.println(flia.cambioAceite());
        System.out.println("\nAuto 0km: "+cerokm.getAuto()+" | "+cerokm.getMarca()+" | "+cerokm.getModelo()+" | "+cerokm.getKm());


        System.out.println(Calendar.getInstance().get(Calendar.YEAR));
    }
}