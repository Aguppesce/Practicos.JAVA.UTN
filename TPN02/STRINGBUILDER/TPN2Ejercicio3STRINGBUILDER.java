package Trabajos_Practicos.TPN2.STRINGBUILDER;

public class TPN2Ejercicio3STRINGBUILDER {
    public static void main(String[] args){
        StringBuilder frase1=new StringBuilder("Nuestros");
        StringBuilder frase2=new StringBuilder("JAVA Programming Languaje");
        StringBuilder frase3=new StringBuilder("Poderio");
        frase1.replace(0,4, "Noso").toString();
        System.out.println(frase1);
        frase2.replace(5,25,"Platform for Windows").toString();
        System.out.println(frase2);
        frase3.replace(2,8, "trero").toString();
        System.out.println(frase3);
    }
}
