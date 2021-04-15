package Trabajos_Practicos.TPN4;
//Encontrar el Error: Sin escribir ningún código, determinar cuál es el problema con este programita:

public class TPN4Ejercicio7 {
    public static void main(String[] args) {

        int limite = 11;
        for (int i = 0; i <= limite; i++) {
            System.out.println(i);
            limite++;
        }
    }
}


//        El error es que se incrementará limite en lugar de i++.