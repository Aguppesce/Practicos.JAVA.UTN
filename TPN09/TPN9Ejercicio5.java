package Trabajos_Practicos.TPN9;

public class TPN9Ejercicio5 {
        public static int suma (int num){
            if(num<=1){
                return 1;
        }else{
                return num+suma(num-1);
            }
    }
    public static void main(String[] args) {
            System.out.println(suma(5));
    }
}
