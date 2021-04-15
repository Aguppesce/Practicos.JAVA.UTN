package Trabajos_Practicos.TPN11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;
import java.sql.PreparedStatement;

public class TPN11Ejercicio5 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/comercio?"; // No se puede conectar a la base de datos sin antes crearla
        String user = "root";
        String password = "123456";
        String sql = "CREATE DATABASE IF NOT EXISTS comercio";
        try(Connection conn= DriverManager.getConnection(url,user,password); PreparedStatement stmt = conn.prepareStatement(sql)) /*No se puede conectar a la base de datos sin antes crearla*/{
            stmt.execute();

            PreparedStatement preparedStatement;
            preparedStatement = conn.prepareStatement("CREATE TABLE IF NOT EXISTS productos (id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                                                                                                  "nombre VARCHAR(100) NOT NULL, " +
                                                                                                  "precio INT(6) NOT NULL, " +
                                                                                                  "marca VARCHAR(100) NOT NULL, " +
                                                                                                  "cantidad INT(10) NOT NULL, " +
                                                                                                  "industria VARCHAR(100) NOT NULL)");
            preparedStatement.execute();

            //TODO
            // teclado.skip("\n"); -> Solución al salto de linea nextLine, poner antes de un nextLine.
            // También se puede usar teclado.nextLine();
            Scanner teclado=new Scanner(System.in);
            System.out.println("Ingrese ID del producto:");
            int id_prod=teclado.nextInt();
            teclado.nextLine();

            System.out.println("Ingrese nombre del producto:");
            String name=teclado.nextLine();

            System.out.println("Ingrese precio del producto:");
            int price=teclado.nextInt();
            teclado.nextLine();

            System.out.println("Ingrese marca del producto:");
            String mark=teclado.nextLine();

            System.out.println("Ingrese cantidad del producto:");
            int quantity=teclado.nextInt();
            teclado.nextLine();

            System.out.println("Ingrese industria del producto:");
            String industry=teclado.nextLine();

            PreparedStatement preparedStmt= conn.prepareStatement("INSERT INTO productos VALUES (?,?,?,?,?,?)", PreparedStatement.RETURN_GENERATED_KEYS);
            preparedStmt.setInt(1,id_prod);
            preparedStmt.setString(2,name);
            preparedStmt.setInt(3,price);
            preparedStmt.setString(4,mark);
            preparedStmt.setInt(5,quantity);
            preparedStmt.setString(6,industry);

            preparedStmt.execute();
            System.out.println("Un nuevo producto fue ingresado");

            preparedStatement.execute();
            preparedStatement.close();

        } catch (SQLException ex) {
            System.out.println(ex);
        }

//TODO CREAR 2 ATRIBUTOS...


        /*String drive= "jdbc:mysql://localhost:3306/";
        "jdbc:mysql://localhost:3306/hotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC","root","123456");
        PreparedStatement ps = micon.prepareStatement("CREATE TABLE IF NOT EXISTS user(user_id SERIAL NOT NULL PRIMARY KEY,username varchar(225) NOT NULL UNIQUE,password varchar(225),islogged varchar(10))");
        Connection micon= DriverManager.getConnection();
        Statement s= micon.createStatement();
        int Result = s.executeUpdate("CREATE DATABASE Comercio");
        PreparedStatement ps = micon.prepareStatement("CREATE TABLE IF NOT EXISTS user(user_id SERIAL NOT NULL PRIMARY KEY,username varchar(225) NOT NULL UNIQUE,password varchar(225),islogged varchar(10))");
        //Statement s1= micon.createStatement("CREATE TABLE IF NOT EXISTS productos (id_producto INTEGER not NULL PRIMARY KEY, nombre VARCHAR(100) not NULL, precio INTEGER not NULL, cantidad INTEGER not NULL)");
        ps.executeUpdate();
        ps.close();*/
    }
}
