package Trabajos_Practicos.TPN11;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.Properties;
import java.util.Scanner;


public class TPN11Ejercicio7 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/videoclub?";
        String user = "root";
        String password = "123456";
        String dir_ingresado;
        int opcion;
        Scanner teclado=new Scanner(System.in);
        try {
            Connection micon = DriverManager.getConnection(url, "root", "123456");
            Statement stmt = micon.createStatement();

            PreparedStatement preparedStatement;
            preparedStatement = micon.prepareStatement("CREATE TABLE IF NOT EXISTS peliculas " +
                    "(id INT(10) NOT NULL AUTO_INCREMENT PRIMARY KEY, " +
                    "valoracion INT(2) NOT NULL, " +
                    "director VARCHAR(100) NOT NULL, " +
                    "titulo VARCHAR(100) NOT NULL, " +
                    "pais VARCHAR(100) NOT NULL, " +
                    "genero VARCHAR(100) NOT NULL, " +
                    "duracion TIME(00) NOT NULL)");
            preparedStatement.execute();
            do {
                System.out.println("\n1) Peliculas de Corea \n2) Peliculas duracion menor a 1 hora\n3) Peliculas de valoracion mayor a 7\n4) Peliculas de valoracion menor a 5\n5) Peliculas de un director ingresador por el usuario\n0) Salir");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        ResultSet rs0 = stmt.executeQuery("SELECT * FROM peliculas WHERE pais = 'Corea'");
                        System.out.println("id    |valoracion     |titulo     |genero     |duracion");
                        while (rs0.next()) {
                            System.out.println(rs0.getInt("id") + "     |" +
                                    rs0.getInt("valoracion") + "        |" +
                                    rs0.getString("titulo") + "     |" +
                                    rs0.getString("genero") + "     |" +
                                    rs0.getTime("duracion"));
                        }
                        break;
                    case 2:
                        ResultSet rs1 = stmt.executeQuery("SELECT * FROM peliculas WHERE duracion < '01:00:00'");
                        System.out.println("id    |valoracion     |titulo     |genero     |duracion");
                        while (rs1.next()) {
                            System.out.println(rs1.getInt("id") + "     |" +
                                    rs1.getInt("valoracion") + "        |" +
                                    rs1.getString("titulo") + "     |" +
                                    rs1.getString("genero") + "     |" +
                                    rs1.getTime("duracion"));
                        }
                        break;
                    case 3:
                        ResultSet rs2 = stmt.executeQuery("SELECT * FROM peliculas WHERE valoracion > 7");
                        while (rs2.next()) {
                            int id_mov = rs2.getInt("id");
                            int valor = rs2.getInt("valoracion");
                            String dir = rs2.getString("director");
                            String title = rs2.getString("titulo");
                            String country = rs2.getString("pais");
                            String gender = rs2.getString("genero");
                            Time duration = rs2.getTime("duracion");
                            System.out.println(id_mov + " - " + valor + " - " + dir + " - " + title + " - " + country + " - " + gender + " - " + duration);
                        }
                        break;
                    case 4:
                        ResultSet rs3 = stmt.executeQuery("SELECT * FROM peliculas WHERE valoracion < 5");
                        while (rs3.next()) {
                            int id_mov = rs3.getInt("id");
                            int valor = rs3.getInt("valoracion");
                            String dir = rs3.getString("director");
                            String title = rs3.getString("titulo");
                            String country = rs3.getString("pais");
                            String gender = rs3.getString("genero");
                            Time duration = rs3.getTime("duracion");
                            System.out.println(id_mov + " - " + valor + " - " + dir + " - " + title + " - " + country + " - " + gender + " - " + duration);
                        }
                        break;
                    case 5:
                        System.out.printf("Ingrese director de la/s peliculas: ");
                        teclado.nextLine();
                        dir_ingresado=teclado.nextLine();
                        ResultSet rs4 = stmt.executeQuery("SELECT * FROM peliculas WHERE director = '"+dir_ingresado+"'");
                        while (rs4.next()) {
                            int id_mov = rs4.getInt("id");
                            int valor = rs4.getInt("valoracion");
                            String dir = rs4.getString("director");
                            String title = rs4.getString("titulo");
                            String country = rs4.getString("pais");
                            String gender = rs4.getString("genero");
                            Time duration = rs4.getTime("duracion");
                            System.out.println(id_mov + " - " + valor + " - " + dir + " - " + title + " - " + country + " - " + gender + " - " + duration);
                        }
                        break;
                }
            }while(opcion!=0);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}

