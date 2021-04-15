package Trabajos_Practicos.TPN2.STRINGBUILDER;

public class TPN2Ejercicio2STRINGBUILDER {
    public static void main(String[] args){
        int number1=7337;
        int number2=11311;
        int number3=113131;
        StringBuilder capicua= new StringBuilder();
        capicua.append(number1).append("\n").append(number2).append("\n").append(number3).append("\n");
        System.out.println((capicua.toString()));
        System.out.println((capicua.reverse()));
    }
}
