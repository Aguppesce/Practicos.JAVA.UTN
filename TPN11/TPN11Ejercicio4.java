package Trabajos_Practicos.TPN11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class TPN11Ejercicio4 {

    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        String title, category, author;
        int cant,clave_primaria=0;
        String url = "jdbc:mysql://localhost:3306/libreria?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        try{
            //conectar
            Connection micon= DriverManager.getConnection(url,"root","123456");
            // load and register JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");//Deprecated com.mysql.jdbc.Driver
            //crear una sentencia SQL

            Statement stmt = micon.createStatement();
            //String query= "INSERT INTO libros (titulo, categoria, autor, cantidad)" + "VALUES (?,?,?,?)"; //Prueba para insertar
            //PreparedStatement preparedStmt= micon.prepareStatement("insert into libros values(?,?,?,?)"); //Prueba para insertar

            System.out.println("Ingrese titulo del libro:");
            title=teclado.nextLine();

            System.out.println("Ingrese categoría del libro:");
            category=teclado.nextLine();

            System.out.println("Ingrese autor del libro:");
            author=teclado.nextLine();

            System.out.println("Ingrese cantidad de libros:");
            cant=teclado.nextInt();
            PreparedStatement preparedStmt= micon.prepareStatement("Insert into libros values (?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStmt.setInt(1,clave_primaria);
            preparedStmt.setString(2,title);
            preparedStmt.setString(3,category);
            preparedStmt.setString(4,author);
            preparedStmt.setInt(5,cant);

            preparedStmt.execute();
            System.out.println("Un nuevo libro fue ingresado");

            ResultSet rs;
            rs=stmt.executeQuery("SELECT titulo, categoria, autor, cantidad FROM libros");
            while(rs.next()){
                String name = rs.getString("titulo");
                String company = rs.getString("categoria");
                String escritor = rs.getString("autor");
                String quantity = rs.getString("cantidad");
                System.out.println(name+" - "+company+" - "+escritor+" - "+quantity);
            }
            micon.close();
        }catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}
