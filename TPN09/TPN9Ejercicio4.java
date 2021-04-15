package Trabajos_Practicos.TPN9;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;
import java.util.Random;
import java.io.*;

public class TPN9Ejercicio4 {
    public static void main(String[] args) throws Exception {
        try {
            String linea;
            File nrosazar= new File("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio4_nrosazar.txt");
            if (!nrosazar.exists()) {
                nrosazar.createNewFile();
            }
            Path ruta = Paths.get("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio4_nrosazar.txt");
            Random rndm = new Random();
            FileWriter fw= new FileWriter("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio4_nrosazar.txt");
            int nroazar;
            for (int i = 0; i < 50; i++) {
                nroazar=rndm.nextInt(2)+0;
                linea = nroazar + " ";
                Files.write(ruta,linea.getBytes(),StandardOpenOption.APPEND);
            }
            List<String> lineas=Files.readAllLines(ruta);
            for(String cadena:lineas){
                System.out.println(cadena);
            }
            fw.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}