/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package conexion.lenguajes_javabasic;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;
/**
 *
 * @author john
 */
public class ConexionLenguajes_javabasic {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Connection conexion = conexionDB.conectar();
        
        Scanner sc = new Scanner(System.in);

        System.out.print("¿Cuántos registros?: ");
        int n = sc.nextInt();
        sc.nextLine();

        String[] nombres = new String[n];
        int[] edades = new int[n];

        // llenar array
        for (int i = 0; i < n; i++) {
            System.out.print("Nombre: ");
            nombres[i] = sc.nextLine();

            System.out.print("Edad: ");
            edades[i] = sc.nextInt();
            sc.nextLine();
        }

        try {
            Connection con = conexionDB.conectar();
             
            String sql = "INSERT INTO personas(nombre, edad) VALUES (?, ?)";
            // los ? van por la cxantidad de campos y se separan por ,
            
            PreparedStatement ps = con.prepareStatement(sql);
            // es la verdadera conexion entre java y sql

            for (int i = 0; i < n; i++) {
                ps.setString(1, nombres[i]);
                ps.setInt(2, edades[i]);
                
                ps.executeUpdate();
                // aca cse guerdan los datos
            }
            
            System.out.println("\n\t");
            System.out.println("Datos guardados en la BD");

        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
}
