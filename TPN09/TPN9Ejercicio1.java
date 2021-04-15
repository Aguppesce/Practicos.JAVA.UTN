package Trabajos_Practicos.TPN9;

import java.io.IOException;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;


public class TPN9Ejercicio1 {
    public static void main(String[] args) throws IOException {
        FileSystem datos= FileSystems.getDefault();
        Path rutaFichero=datos.getPath("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA Maven\\src\\main\\java\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio1_datos.txt");
        System.out.println(rutaFichero.getParent().getFileName());
        try {
            List<String> texto= Files.readAllLines(rutaFichero);
            for(String cadena:texto) {
                System.out.println(cadena);
            }
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}

//https://www.arquitecturajava.com/gestion-de-ficheros-con-java-nio-path/


//OTRO FORMA
/*package Trabajos_Practicos.TPN9.Ejercicio1;
import java.io.*;

public class TPN9Ejercicio1 {
    //Metodo para mostrar contenido
    public static void muestraContenido(String datos) throws FileNotFoundException, IOException {
        String cadena;
        FileReader fr = new FileReader(datos);
        BufferedReader br = new BufferedReader(fr);
        while((cadena = br.readLine())!=null) {
            System.out.println(cadena);
        }
        br.close();
    }
    public static void main(String[] args) throws IOException {
        muestraContenido("C:\\Users\\Admin\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\Ejercicio1\\datos.txt");
    }
 }*/
