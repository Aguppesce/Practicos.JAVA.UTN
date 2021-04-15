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


public class TPN11Ejercicio8 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/gestion_alumnos?";
        String user = "root";
        String password = "123456";
        int opcion;
        Scanner teclado=new Scanner(System.in);
        try {
            Connection micon = DriverManager.getConnection(url, "root", "123456");
            Statement stmt = micon.createStatement();

            do {
                System.out.println("\n1) Mostrar Alumnos \n2) Mostrar Alumnas\n3) Mayores de 25\n0) Salir");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        ResultSet rs0 = stmt.executeQuery("SELECT * FROM alumnos WHERE sexo = 'masculino'");
                        System.out.printf("id       |nombre     |apellido       |sexo       |dni        |edad\n");
                        while (rs0.next()) {
                            System.out.println(rs0.getInt("id_alumno") + "      |" +
                                    rs0.getString("nombre") + "     |" +
                                    rs0.getString("apellido") + "       |" +
                                    rs0.getString("sexo") + "       |" +
                                    rs0.getInt("dni") + "       |" +
                                    rs0.getInt("edad")/*+"\n"+
                                    rs0.getInt("id_profesor")+" | "+
                                    rs0.getString("nombre")+" | "+
                                    rs0.getString("apellido")+" | "+
                                    rs0.getInt("dni")+"\n"+
                                    rs0.getInt("id_asignatura")+" | "+
                                    rs0.getString("nombre")+" | "+
                                    rs0.getString("carrera")+" | "+
                                    rs0.getInt("id_profesor")+" | "+
                                    rs0.getInt("ciclo")+"\n"+
                                    rs0.getInt("id_examen")+" | "+
                                    rs0.getInt("id_asignatura")+" | "+
                                    rs0.getDate("fecha")+" | "+
                                    rs0.getInt("nota")+" | "+
                                    rs0.getInt("id_alumno")*/);
                        }
                        break;
                    case 2:
                        ResultSet rs1 = stmt.executeQuery("SELECT * FROM alumnos WHERE sexo = 'femenino'");
                        System.out.printf("id       |nombre     |apellido       |sexo       |dni        |edad\n");
                        while (rs1.next()) {
                            System.out.println(rs1.getInt("id_alumno") + "      |" +
                                    rs1.getString("nombre") + "     |" +
                                    rs1.getString("apellido") + "       |" +
                                    rs1.getString("sexo") + "       |" +
                                    rs1.getInt("dni") + "       |" +
                                    rs1.getInt("edad"));
                        }
                        break;
                    case 3:
                        ResultSet rs2 = stmt.executeQuery("SELECT * FROM alumnos WHERE edad > 25");
                        System.out.printf("id       |nombre     |apellido       |sexo       |dni        |edad\n");
                        while (rs2.next()) {
                            System.out.println(rs2.getInt("id_alumno") + "      |" +
                                    rs2.getString("nombre") + "     |" +
                                    rs2.getString("apellido") + "       |" +
                                    rs2.getString("sexo") + "       |" +
                                    rs2.getInt("dni") + "       |" +
                                    rs2.getInt("edad"));
                        }
                        break;
                }
            }while(opcion!=0);
        } catch (SQLException ex) {
            System.out.println(ex);
        }
    }
}