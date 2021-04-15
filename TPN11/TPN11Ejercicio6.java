package Trabajos_Practicos.TPN11;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;
import java.util.Scanner;

public class TPN11Ejercicio6 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/comercio?userServerPrepStmts=true&useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC";
        int opcion;
        Scanner teclado = new Scanner(System.in);
        try {
            Connection micon = DriverManager.getConnection(url, "root", "123456");
            Statement stmt = micon.createStatement();
            do {
                System.out.println("\nDesea ver los productos de China o de Argentina? \n1) Ver productos industria China \n2) Ver productos industria Argentina\n0) Salir");
                opcion = teclado.nextInt();
                switch (opcion) {
                    case 1:
                        ResultSet rs = stmt.executeQuery("SELECT * FROM productos WHERE industria = 'china'");
                        while (rs.next()) {
                            int id_prod = rs.getInt("id");
                            String name = rs.getString("nombre");
                            int price = rs.getInt("precio");
                            String mark = rs.getString("marca");
                            int quanty = rs.getInt("cantidad");
                            String industry = rs.getString("industria");
                            System.out.println(id_prod + " - " + name + " - " + price + " - " + mark + " - " + quanty + " - " + industry);
                        }
                        break;
                    case 2:
                        ResultSet rs1 = stmt.executeQuery("SELECT * FROM productos where industria = 'argentina'");
                        while (rs1.next()) {
                            int id_prod = rs1.getInt("id");
                            String name = rs1.getString("nombre");
                            int price = rs1.getInt("precio");
                            String mark = rs1.getString("marca");
                            int quanty = rs1.getInt("cantidad");
                            String industry = rs1.getString("industria");
                            System.out.println(id_prod + " - " + name + " - " + price + " - " + mark + " - " + quanty + " - " + industry);
                        }
                        break;
                }
            } while (opcion != 0);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

