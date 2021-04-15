package Trabajos_Practicos.TPN9;

import java.io.*;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;
import java.util.Scanner;
import java.util.NoSuchElementException;

public class TPN9Ejercicio3 {
    public static void main(String[] args) throws Exception {
        String usuario;
        try (FileWriter fw=new FileWriter("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio3_palabras.txt",true);
            FileReader fr=new FileReader("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\TPN9Ejercicio3_palabras.txt")){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduzca una palabra u oración");
            for(int i=0; i<5; i++){
                usuario=teclado.nextLine();
                fw.write(usuario);
                fw.write("\n");
                fw.flush();
            }
            fw.close();
        }catch(IOException e){
                e.printStackTrace();
            }
    }
}

/*
public class TPN9Ejercicio3 {
    public static void main(String[] args) throws Exception {
        String usuario;
        try(FileWriter fw=new FileWriter("O:\\Documentos\\Facultad\\GoogleDrive\\JAVA\\Proyectos IntelliJ IDEA\\src\\Trabajos_Practicos\\TPN9\\Ejercicio3\\palabras.txt");
            BufferedWriter bw= new BufferedWriter(fw)){
            Scanner teclado=new Scanner(System.in);
            System.out.println("Introduzca una palabra");
            for(int i=0; i<5; i++){
                usuario=teclado.nextLine();
                bw.write(usuario);
                bw.newLine();
                fw.flush();
            }
            bw.close();
        }catch(IOException e){
                e.printStackTrace();
            }
    }
}

 */


