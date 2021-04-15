package Trabajos_Practicos.TPN11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;

public class TPN11Ejercicio3 {

    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/videojuegos?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        //jdbc:mysql://localhost:3306/contactos";
        try{
            //conectar
            Connection micon= DriverManager.getConnection(url,"root","123456");
            // load and register JDBC driver for MySQL
            Class.forName("com.mysql.cj.jdbc.Driver");
            //Deprecated com.mysql.jdbc.Driver
            //crear una sentencia SQL
            Statement stmt = micon.createStatement();
            String query= "INSERT INTO juegos (nombre, empresa, precio, fecha_estreno) "+"VALUES('Cyberpunk 2077', 'ProyectCD', 2700, '2020-09-20')";
            stmt.executeUpdate(query);
            System.out.println("Un nuevo juego fue ingresado");
            ResultSet rs;
            rs=stmt.executeQuery("SELECT nombre, empresa, precio, fecha_estreno FROM juegos");
            while(rs.next()){
                String name = rs.getString("nombre");
                String company = rs.getString("empresa");
                String price = rs.getString("precio");
                String date = rs.getString("fecha_estreno");
                System.out.println(name+" - "+company+" - "+price+"€"+" - "+date);
            }
            micon.close();
        }catch(Exception e){
            System.err.println("Got an exception!");
            System.err.println(e.getMessage());
        }
    }
}


