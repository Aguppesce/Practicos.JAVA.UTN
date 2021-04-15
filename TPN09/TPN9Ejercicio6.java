package Trabajos_Practicos.TPN9;

public class TPN9Ejercicio6 {
    public static void main(String[] args) {
        int serie = 100;
        for (int i = 0; i < serie; i++) {
            System.out.println(fibonacci(i));
        }
    }
        public static int fibonacci (int n){
            if (n==0){
                return 0;
            } else if(n==1){
                return 1;
            } else {
                return fibonacci(n-1)+fibonacci(n-2);
            }
        }
    }

