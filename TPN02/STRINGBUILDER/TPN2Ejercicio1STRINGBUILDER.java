package Trabajos_Practicos.TPN2.STRINGBUILDER;

public class TPN2Ejercicio1STRINGBUILDER {
    public static void main(String[] args){
        String palabra;
        StringBuilder palindromo=new StringBuilder("Anana\nSotos\nSus\nMotor\nSometemos\nSuertes");
        palabra=palindromo.reverse().toString();
        palabra.equalsIgnoreCase(palindromo.toString());
        System.out.println((palabra));
    }
}