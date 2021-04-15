package Trabajos_Practicos.TPN11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;

public class TPN11Ejercicio2 {

        public static void main(String[] args) {
            String url = "jdbc:mysql://localhost:3306/hotel?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
            //jdbc:mysql://localhost:3306/contactos";
            try{
                //conectar
                Connection micon= DriverManager.getConnection(url,"root","123456");
                // load and register JDBC driver for MySQL
                Class.forName("com.mysql.cj.jdbc.Driver");
                //Deprecated com.mysql.jdbc.Driver
                //crear una sentencia SQL
                Statement stmt = micon.createStatement();
                ResultSet rs;
                rs=stmt.executeQuery("SELECT nombre, apellido,checkout FROM clientes");
                while(rs.next()){
                    String lastName = rs.getString("nombre");
                    String firstnName = rs.getString("apellido");
                    String checkoutdate = rs.getString("checkout");
                    System.out.println(lastName+" - "+firstnName+" - "+checkoutdate);
                }
                micon.close();
            }catch(Exception e){
                System.err.println("Got an exception!");
                System.err.println(e.getMessage());
            }
        }
    }


