package Trabajos_Practicos.TPN9;

import java.io.*;
import java.nio.file.*;
import java.util.List;


public class TPN9Ejercicio2 {
    public static void main(String[] args) throws IOException {
        try(BufferedReader br=new BufferedReader(new FileReader("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio2_nros.txt"))){
            List<String> texto= Files.readAllLines(Paths.get("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio2_nros.txt"));
            for(String cadena:texto) {
            System.out.println(cadena);
             }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
