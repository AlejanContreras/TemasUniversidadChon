/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conexion.lenguajes_javapoo;

/**
 *
 * @author john
 */
public class Admin extends Usuario {

    // Constructor
    public Admin(String nombre) {
        super(nombre, "admin"); // llama al constructor de Usuario
    }

    // 🔥 POLIMORFISMO (override)
    @Override
    public void prestarLibro() {
        System.out.println("Admin puede prestar libros sin límite");
    }
}
