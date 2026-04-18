/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.lenguajes_javapoo;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author john
 */
public class ConexionDB {

    public static Connection conectar() {

        String url = "jdbc:mysql://localhost:3306/ejem_conexionLenguaje_javaPOO";
        String user = "root";
        String password = "carnedegato";

        try {
            Connection con = DriverManager.getConnection(url, user, password);
            System.out.println("Conectado a BD POO");
            return con;
        } catch (Exception e) {
            System.out.println("Error: " + e);
            return null;
        }
    }
}
